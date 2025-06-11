package com.nursena.studentproject.service;

import com.nursena.studentproject.model.*;
import com.nursena.studentproject.repository.AssignmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AssignmentService {

    private final AssignmentRepository assignmentRepository;

    public Assignment saveAssignment(String topic, String description, 
                                     String dueDate, String type, Integer questionCount, Boolean groupProject) {

        Assignment assignment;

        if ("exercise".equalsIgnoreCase(type)) {
            assignment = new Exercise();
            ((Exercise) assignment).setQuestionCount(questionCount);
        } else if ("project".equalsIgnoreCase(type)) {
            assignment = new Project();
            ((Project) assignment).setGroupProject(groupProject != null && groupProject);
        } else {
            throw new IllegalArgumentException("Geçersiz ödev tipi: " + type);
        }

        assignment.setTopic(topic);
        assignment.setDescription(description);
        assignment.setDueDate(java.time.LocalDate.parse(dueDate));

        return assignmentRepository.save(assignment);
    }

    public List<Assignment> getAllAssignments() {
        return assignmentRepository.findAll();
    }
}
