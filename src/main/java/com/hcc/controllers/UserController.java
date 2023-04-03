package com.hcc.controllers;

import com.hcc.entities.Assignment;
import com.hcc.repositories.AssignmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    AssignmentRepository assignmentRepository;

    @GetMapping
    public ResponseEntity<?> getAssignments() {
        List<Assignment> assignments = assignmentRepository.findAll();
        return ResponseEntity.ok(assignments);
    }

    @GetMapping("{userId}")
    public ResponseEntity<?> getAssignmentById(@PathVariable Long assignmentId) {
        Optional<Assignment> assignmentOptional = assignmentRepository.findById(assignmentId);
        return ResponseEntity.ok(assignmentOptional.orElse(new Assignment()));
    }

    @PostMapping
    public ResponseEntity<?> createAssignment(@RequestBody Assignment assignment) {
        return ResponseEntity.ok(assignmentRepository.save(assignment));
    }
}
