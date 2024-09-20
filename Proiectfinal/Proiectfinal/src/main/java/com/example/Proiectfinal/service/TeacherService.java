package com.example.Proiectfinal.service;

import com.example.Proiectfinal.entity.Teacher;
import com.example.Proiectfinal.exceptions.TeacherNotFoundException;
import com.example.Proiectfinal.repository.TeacherRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TeacherService {

    private final TeacherRepository teacherRepository;

    public TeacherService(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    public Teacher gasesteProfesorDupaId(String Nume) {
        return TeacherRepository.findByNume(Nume)
                .orElseThrow(() -> new TeacherNotFoundException("Profesorul cu id-ul " + Nume + " nu a fost găsit"));
    }

    // Alte metode...
}