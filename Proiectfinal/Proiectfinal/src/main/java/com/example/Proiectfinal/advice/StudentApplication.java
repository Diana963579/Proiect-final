package com.example.Proiectfinal.advice;

import com.example.Proiectfinal.entity.Student;
import com.example.Proiectfinal.enums.StudyLevel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class StudentApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentApplication.class, args);

        // Creează un obiect Student în metoda main
        Student student = new Student(1L, "Maria", "Ionescu", 21, StudyLevel.MASTER,"CIG");
        System.out.println("Student creat: " + student.getNume() + " " + student.getPrenume());
    }
}
