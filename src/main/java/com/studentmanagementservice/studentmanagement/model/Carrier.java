package com.studentmanagementservice.studentmanagement.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity(name = "carrier")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Carrier {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id ;

    //les referenes d'autre tables

    private String fk_student_cin ;

    @Enumerated(EnumType.STRING)
    private Diplomat diplomat;
}
