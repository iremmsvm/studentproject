package com.nursena.studentproject.controller;

import com.nursena.studentproject.model.Assignment;
import com.nursena.studentproject.service.AssignmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/assignments")
@RequiredArgsConstructor
public class AssignmentController {

    private final AssignmentService assignmentService;

    @PostMapping
    public Assignment createAssignment(@RequestParam String topic,
                                       @RequestParam(required = false) String description,
                                       @RequestParam String dueDate,
                                       @RequestParam String type,
                                       @RequestParam(required = false) Integer questionCount,
                                       @RequestParam(required = false) Boolean groupProject) {
        return assignmentService.saveAssignment(topic, description, dueDate, type, questionCount, groupProject);
    }

    @GetMapping
    public List<Assignment> getAllAssignments() {
        return assignmentService.getAllAssignments();
    }
}
