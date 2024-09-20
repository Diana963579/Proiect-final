package com.example.Proiectfinal.advice;

import com.example.Proiectfinal.entity.Student;
import com.example.Proiectfinal.enums.StudyLevel;

public class Main {
    public static void main(String[] args) {
        // Creează un obiect Student
        Student student = new Student(1L, "Maria", "Ionescu", 21, StudyLevel.MASTER,"CIG");

        // Afișează detaliile studentului
        System.out.println("ID: " + student.getId());
        System.out.println("Nume: " + student.getNume());
        System.out.println("Prenume: " + student.getPrenume());
        System.out.println("Age: " + student.getAge());
        System.out.println("Nivel de studiu: " + student.getStudyLevel());
        System.out.println("Numar matricol: " + student.getNumarMatricol());
    }
}