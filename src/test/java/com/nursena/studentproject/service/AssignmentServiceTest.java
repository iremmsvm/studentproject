package com.nursena.studentproject.service;

import com.nursena.studentproject.model.Assignment;
import com.nursena.studentproject.model.Exercise;
import com.nursena.studentproject.model.Project;
import com.nursena.studentproject.repository.AssignmentRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class AssignmentServiceTest {

    private AssignmentRepository assignmentRepository;
    private AssignmentService assignmentService;

    @BeforeEach
    void setUp() {
        assignmentRepository = mock(AssignmentRepository.class);
        assignmentService = new AssignmentService(assignmentRepository);
    }

    @Test
    void shouldSaveExerciseAssignment() {
        Exercise exercise = new Exercise();
        exercise.setTopic("Lambda");
        exercise.setDescription("Test");
        exercise.setDueDate(LocalDate.parse("2025-06-20"));
        exercise.setQuestionCount(10);

        when(assignmentRepository.save(Mockito.any(Assignment.class))).thenReturn(exercise);

        Assignment saved = assignmentService.saveAssignment("Lambda", "Test", "2025-06-20", "exercise", 10, null);

        assertTrue(saved instanceof Exercise);
        assertEquals("Lambda", saved.getTopic());
        verify(assignmentRepository).save(any(Exercise.class));
    }

    @Test
    void shouldSaveProjectAssignment() {
        Project project = new Project();
        project.setTopic("REST API");
        project.setDescription("Spring Boot");
        project.setDueDate(LocalDate.parse("2025-06-25"));
        project.setGroupProject(true);

        when(assignmentRepository.save(Mockito.any(Assignment.class))).thenReturn(project);

        Assignment saved = assignmentService.saveAssignment("REST API", "Spring Boot", "2025-06-25", "project", null, true);

        assertTrue(saved instanceof Project);
        assertTrue(((Project) saved).isGroupProject());
        verify(assignmentRepository).save(any(Project.class));
    }

    @Test
    void shouldThrowExceptionForInvalidType() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            assignmentService.saveAssignment("Invalid", "Test", "2025-06-30", "quiz", null, null);
        });

        assertEquals("Geçersiz ödev tipi: quiz", exception.getMessage());
    }
}
