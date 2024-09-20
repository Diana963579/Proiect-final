package com.example.Proiectfinal.Controller.advice;

import com.example.Proiectfinal.entity.Student;
import com.example.Proiectfinal.enums.StudyLevel;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/studenti")

public class StudentController {

    @PostMapping("/adauga")
    public Student adaugaStudent(@RequestBody Student student) {
        // Poți folosi obiectul primit direct sau creezi unul nou dacă e cazul
        return new Student(student.getId(), student.getNume(), student.getPrenume(), student.getAge(), student.getStudyLevel(),student.getNumarMatricol());
    }

    @GetMapping("/exemplu")
    public Student exempluStudent() {
        // Creezi un obiect Student pentru testare
        return new Student(1L, "Ion", "Popescu", 22, StudyLevel.LICENTA,"CIG");
    }
}
