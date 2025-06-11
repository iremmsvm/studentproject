package com.nursena.studentproject.service;

import com.nursena.studentproject.model.Assignment;
import com.nursena.studentproject.model.Student;
import com.nursena.studentproject.repository.AssignmentRepository;
import com.nursena.studentproject.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;
    private final AssignmentRepository assignmentRepository;

    public Student assignAssignmentToStudent(String studentNo, Long assignmentId) {
        Student student = studentRepository.findById(studentNo)
                .orElseThrow(() -> new IllegalArgumentException("Öğrenci bulunamadı: " + studentNo));
        Assignment assignment = assignmentRepository.findById(assignmentId)
                .orElseThrow(() -> new IllegalArgumentException("Ödev bulunamadı: " + assignmentId));

        student.getAssignments().add(assignment);
        return studentRepository.save(student);
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }
}
