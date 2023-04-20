package com.studentmanagementservice.studentmanagement.service;

import com.studentmanagementservice.studentmanagement.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

public interface StudentService {
    void createStudent(Student student);

    List<Student> getAllStudents();

    Student getStudentById(String cin);//cin=id

    void updateStudent(Student student);

    void deleteStudent(String cin);

}
