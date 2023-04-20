package com.studentmanagementservice.studentmanagement.dto;

import com.studentmanagementservice.studentmanagement.model.Diplomat;
import lombok.Builder;
import lombok.Data;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Data
@Builder
public class RespenseCarrierDto {

    private int id ;

    private String fk_student_cin ;

    private Diplomat diplomat;
}
