package com.nursena.studentproject.model;

import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Exercise extends Assignment {
    private int questionCount;
}
