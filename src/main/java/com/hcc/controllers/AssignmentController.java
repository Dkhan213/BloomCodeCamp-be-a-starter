package com.hcc.controllers;

import com.hcc.entities.Assignment;
import com.hcc.entities.User;
import com.hcc.services.AssignmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class AssignmentController {

    @Autowired
    AssignmentService assignmentService;

    @GetMapping
    public ResponseEntity<?> getAllAssignments(@PathVariable Long id) {
        return (ResponseEntity<?>) assignmentService.getAllAssignments(id);
    }

    @GetMapping("/user/{userId}/assignments/{assignmentId}")
    public ResponseEntity<?> getAssignmentById(@PathVariable Long assignmentId) {
        Optional<Assignment> assignmentOptional = assignmentService.getAssignment(assignmentId);
        return ResponseEntity.ok(assignmentOptional.orElse(new Assignment()));
    }

    @PostMapping("/user/{userId}/assignments")
    public void createAssignment(@RequestBody Assignment assignment, @PathVariable Long userId) {
        assignment.setUser(new User(userId));
        assignmentService.addAssignment(assignment);
    }

    @PutMapping("/user/{userId}/assignment/{assignmentId}")
    public void updateAssignment(@RequestBody Assignment assignment,@PathVariable Long userId, @PathVariable Long assignmentId) {
        assignment.setUser(new User(userId));
        assignmentService.updateAssignment(assignment);
    }

    @DeleteMapping("/user/{userId}/assignments/{assignmentId}")
    public void deleteAssignment(@PathVariable Long id) {
        assignmentService.deleteAssignment(id);
    }
}
