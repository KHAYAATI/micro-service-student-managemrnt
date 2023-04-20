package com.studentmanagementservice.studentmanagement.repositories;

import com.studentmanagementservice.studentmanagement.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepositorie extends JpaRepository<Student,String> {
}
