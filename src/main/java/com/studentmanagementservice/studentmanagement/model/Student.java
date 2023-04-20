package com.studentmanagementservice.studentmanagement.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "student")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String cin ;
    private String nom ;
    private String prenom ;
    private String cne ;
    private String email ;
    private String phone;
    private Date date_naissance ;
    private String lieu_naissance ;
    private String province ;
    private String ville ;
    private String adresse ;
    private Gender genre ;
    @Enumerated(EnumType.STRING)
    private Fonctionnaire fonctionnaire ;
    private String etablissement ;
    @Enumerated(EnumType.STRING)
    private Diplomat diplomat ;

    //les referenes d'autre tables

    private int fk_filier ;






}
