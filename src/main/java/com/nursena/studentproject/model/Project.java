package com.nursena.studentproject.model;

import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Project extends Assignment {
    private boolean groupProject;
}
