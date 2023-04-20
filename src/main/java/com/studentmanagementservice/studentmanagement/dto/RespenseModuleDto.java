package com.studentmanagementservice.studentmanagement.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RespenseModuleDto {
    private int id ;
    private String name_module ;

}
