package com.example.Proiectfinal.repository;

import com.example.Proiectfinal.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, String> {
    static Optional<Teacher> findByNume(String nume) {
        return null;
    }
}