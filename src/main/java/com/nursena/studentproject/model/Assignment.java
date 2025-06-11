package com.nursena.studentproject.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "assignment_type")
@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class Assignment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String topic;
    private String description;
    private LocalDate dueDate;
}
