package com.example.Proiectfinal.repository;

import com.example.Proiectfinal.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
    }
