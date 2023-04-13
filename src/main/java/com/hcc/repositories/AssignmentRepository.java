package com.hcc.repositories;

import com.hcc.entities.Assignment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * A <b>Class</b> that communicates with the table: <b>assignments</b> to create/update/delete assignments.
 */
public interface AssignmentRepository extends JpaRepository<Assignment, Long> {

    // Finds an assignment using the userId associated with it.
    public List<Assignment> findByUserId(Long userId);
}
