package com.nursena.studentproject.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Student {

    @Id
    private String studentNo;

    private String firstName;
    private String lastName;
    private String department;

    @ManyToMany
    private List<Assignment> assignments;
}
