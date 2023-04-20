package com.studentmanagementservice.studentmanagement.service;

import com.studentmanagementservice.studentmanagement.model.Filier;
import com.studentmanagementservice.studentmanagement.model.Student;

import java.util.List;

public interface FilierService {
    void createFilier(Filier filier);

    List<Filier> getAllFiliers();

    Filier getFilierById(int id);

    void updateFilier(Filier filier);

    void deleteFilier(int id);
}

