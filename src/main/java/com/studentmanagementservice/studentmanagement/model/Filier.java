package com.studentmanagementservice.studentmanagement.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "filier")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Filier {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id ;
    private String name_filier ;

    //les referenes d'autre tables

    private int fk_module ;

}
