package com.nursena.studentproject.controller;

import com.nursena.studentproject.model.Student;
import com.nursena.studentproject.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @PostMapping
    public Student createStudent(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }

    @PostMapping("/assign")
    public Student assignAssignment(@RequestParam String studentNo, @RequestParam Long assignmentId) {
        return studentService.assignAssignmentToStudent(studentNo, assignmentId);
    }

    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }
}
