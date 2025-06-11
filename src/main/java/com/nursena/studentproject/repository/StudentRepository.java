package com.nursena.studentproject.repository;

import com.nursena.studentproject.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, String> {
    // Öğrenci No primary key olduğu için tipi String
}
