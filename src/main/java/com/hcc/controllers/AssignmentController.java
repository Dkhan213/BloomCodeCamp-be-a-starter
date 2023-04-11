package com.hcc.controllers;

import com.hcc.entities.Assignment;
import com.hcc.exceptions.ResourceNotFoundException;
import com.hcc.services.AssignmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * A <b>Controller CLass</b> that communicates with the <b>AssignmentService</b> in order to update the table: <b>assignments</b>.
 * Has various endpoints that it handles including <B>GET</B> requests, <b>POST</b> requests, <b>PUT</b> requests, and
 * <b>DELETE</b> requests.
 */

@CrossOrigin
@RestController
@RequestMapping("api/v1/assignments")
public class AssignmentController {

    @Autowired
    AssignmentService assignmentService;

    @GetMapping
    // Lets Spring Boot Security know that Users with any Authority can use the method: getAllAssignments.
    @PreAuthorize("hasAnyRole('ROLE_ADMIN', 'ROLE_REVIEWER', 'ROLE_STUDENT')")
    public List<Assignment> getAllAssignments() {
        return assignmentService.getAllAssignments();
    }

    @GetMapping("{id}")
    // Lets Spring Boot Security know that Users with any Authority can use the method:getAssignmentsById.
    @PreAuthorize("hasAnyRole('ROLE_ADMIN', 'ROLE_REVIEWER', 'ROLE_STUDENT')")
    public Assignment getAssignmentById(@PathVariable("id") Long assignmentId) {
        return  assignmentService.getAssignment(assignmentId)
                .orElseThrow(() -> new ResourceNotFoundException("Assignment not exist with id :" + assignmentId));
    }

    @PostMapping
    // Lets Spring Boot Security know that Users with any Authority can use the method: createAssignment.
    @PreAuthorize("hasAnyRole('ROLE_ADMIN', 'ROLE_REVIEWER', 'ROLE_STUDENT')")
    public ResponseEntity<?> createAssignment(@RequestBody Assignment assignment) {
        assignmentService.addAssignment(assignment);
        Map<String, Boolean> response = new HashMap<>();
        response.put("Added Assignment", Boolean.TRUE);
        return ResponseEntity.ok(response);
    }

    @PutMapping("{id}")
    // Lets Spring Boot Security know that Users with any Authority can use the method: updateAssignment.
    @PreAuthorize("hasAnyRole('ROLE_ADMIN', 'ROLE_REVIEWER', 'ROLE_STUDENT')")
    public ResponseEntity<?> updateAssignment(@RequestBody Assignment assignment, @PathVariable("id") Long assignmentId) {
        Assignment assignment1 = assignmentService.getAssignment(assignmentId)
                .orElseThrow(() -> new ResourceNotFoundException("Assignment does not exist with id :" + assignmentId));

        assignment1.setUser(assignment.getUser());
        assignment1.setBranch(assignment.getBranch());
        assignment1.setNumber(assignment.getNumber());
        assignment1.setStatus(assignment.getStatus());
        assignment1.setGithubUrl(assignment.getGithubUrl());
        assignment1.setReviewVideoUrl(assignment.getReviewVideoUrl());

        assignmentService.updateAssignment(assignment1);

        Map<String, Boolean> response = new HashMap<>();
        response.put("Updated Assignment", Boolean.TRUE);
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("{id}")
    // Lets Spring Boot Security know that Users with any Authority can use the method: deleteAssignment.
    @PreAuthorize("hasAnyRole('ROLE_ADMIN', 'ROLE_REVIEWER', 'ROLE_STUDENT')")
    public ResponseEntity<?> deleteAssignment(@PathVariable("id") Long assignmentId) {
        assignmentService.deleteAssignment(assignmentId);
        Map<String, Boolean> response = new HashMap<>();
        response.put("Deleted Assignment", Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
}
