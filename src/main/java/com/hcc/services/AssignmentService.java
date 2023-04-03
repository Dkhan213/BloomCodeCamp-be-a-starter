package com.hcc.services;

import com.hcc.entities.Assignment;
import com.hcc.repositories.AssignmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AssignmentService {

    @Autowired
    AssignmentRepository assignmentRepository;

    public List<Assignment> getAllAssignments(Long userId) {
        return assignmentRepository.findByUserId(userId);
    }

    public Optional<Assignment> getAssignment(Long id) {
        return assignmentRepository.findById(id);
    }

    public void addAssignment(Assignment assignment) {
        assignmentRepository.save(assignment);
    }

    public void updateAssignment(Assignment assignment) {
        assignmentRepository.save(assignment);
    }

    public void deleteAssignment(Long id) {
        assignmentRepository.deleteById(id);
    }
}
