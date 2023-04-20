package com.studentmanagementservice.studentmanagement.dto;

import com.studentmanagementservice.studentmanagement.model.Diplomat;
import com.studentmanagementservice.studentmanagement.model.Fonctionnaire;
import com.studentmanagementservice.studentmanagement.model.Gender;
import lombok.Builder;
import lombok.Data;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.util.Date;

@Data
@Builder
public class RespenseStudentDto {
    private int id ;
    private String nom ;
    private String prenom ;
    private String cin ;
    private String cne ;
    private String email ;
    private String phone;
    private Date date_naissance ;
    private String lieu_naissance ;
    private String province ;
    private String ville ;
    private String adresse ;
    private Gender genre ;
    private Fonctionnaire fonctionnaire ;
    private String etablissement ;
    private Diplomat diplomat ;
    private int fk_filier ;
}
