package com.hcc.controllers;


import com.hcc.entities.User;
import com.hcc.exceptions.ResourceNotFoundException;
import com.hcc.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * This is the <b>Controller</b> <em>Class</em> for the <b>ROLE_ADMIN</b> <em>Authority</em>
 * created in order to handle all requests to create/update/delete <b>Users</b> of the application.
 */

@RestController
@RequestMapping("management/api/v1/students")
public class ManagementController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping

 //PreAuthorize is an annotation to let Spring Boot Security know that only Users with the
 //Authority of either ROLE_ADMIN or ROLE_REVIEWER are allowed to use the methed: getAllStudents
    @PreAuthorize("hasAnyRole('ROLE_ADMIN', 'ROLE_REVIEWER')")
    public List<User> getAllStudents() {
        return userRepository.findAll();
    }

    @PostMapping
    // Only Users with the ROLE_ADMIN Authority all allowed to use the method: registerNewStudent.
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public User registerNewStudent(@RequestBody User student) {
        Date date = Date.valueOf(LocalDate.now());
        student.setCohortStartDate(date);
        return userRepository.save(student);
    }

    @DeleteMapping("{studentId}")
    // Only Users with the ROLE_ADMIN Authority all allowed to use the method: deleteStudent.
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public ResponseEntity<?> deleteStudent(@PathVariable("studentId") Long studentId) {
        User employee = userRepository.findById(studentId)
                .orElseThrow(() -> new ResourceNotFoundException("User not exist with id :" + studentId));

        userRepository.delete(employee);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return ResponseEntity.ok(response);
    }

    @PutMapping("{studentId}")
    // Only Users with the ROLE_ADMIN Authority all allowed to use the method: updateStudent.
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public ResponseEntity<?> updateStudent(@PathVariable("studentId") Long studentId, @RequestBody User student) {
        User employee = userRepository.findById(studentId)
                .orElseThrow(() -> new ResourceNotFoundException("User does not exist with id :" + studentId));

        employee.setCohortStartDate(student.getCohortStartDate());
        employee.setUsername(student.getUsername());

        User updatedEmployee = userRepository.save(employee);
        return ResponseEntity.ok(updatedEmployee);
    }
}
