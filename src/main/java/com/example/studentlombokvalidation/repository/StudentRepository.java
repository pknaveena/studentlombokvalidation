package com.example.studentlombokvalidation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.studentlombokvalidation.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long>{
    
}
