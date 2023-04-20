package com.studentmanagementservice.studentmanagement.dto;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class RequestStudentDto {
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

}
