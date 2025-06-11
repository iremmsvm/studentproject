package com.nursena.studentproject.repository;

import com.nursena.studentproject.model.Assignment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssignmentRepository extends JpaRepository<Assignment, Long> {
}
