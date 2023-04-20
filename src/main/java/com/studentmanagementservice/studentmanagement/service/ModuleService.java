package com.studentmanagementservice.studentmanagement.service;

import com.studentmanagementservice.studentmanagement.model.ModuleF;
import com.studentmanagementservice.studentmanagement.model.Student;

import java.util.List;

public interface ModuleService {
    void createModule(ModuleF module);

    List<ModuleF> getAllModules();

    ModuleF getModuleById(int id );

    void updateModule(ModuleF module);

    void deleteModule(int id);
}
