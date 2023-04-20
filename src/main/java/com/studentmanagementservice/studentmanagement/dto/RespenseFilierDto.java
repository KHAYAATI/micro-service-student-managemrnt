package com.studentmanagementservice.studentmanagement.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RespenseFilierDto {
    private int id ;
    private String name_filier ;

    private int fk_module ;
}
