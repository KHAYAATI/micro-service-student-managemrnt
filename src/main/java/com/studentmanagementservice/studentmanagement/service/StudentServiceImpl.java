package com.studentmanagementservice.studentmanagement.service;

import com.studentmanagementservice.studentmanagement.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{
    @Override
    public void createStudent(Student student) {

    }

    @Override
    public List<Student> getAllStudents() {
        return null;
    }

    @Override
    public Student getStudentById(String cin) {
        return null;
    }

    @Override
    public void updateStudent(Student student) {

    }

    @Override
    public void deleteStudent(String cin) {

    }
}
