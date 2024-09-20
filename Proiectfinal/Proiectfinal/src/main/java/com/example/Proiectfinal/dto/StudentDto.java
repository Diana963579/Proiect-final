package com.example.Proiectfinal.dto;

import com.example.Proiectfinal.enums.StudyLevel;

public class StudentDto {

    private Long id;
    private String nume;
    private String prenume;
    private int age;
    private StudyLevel studyLevel;
    private String numarMatricol;

    // Constructor fără parametri
    public StudentDto() {
    }

    // Constructor cu parametri
    public StudentDto(Long id, String nume, String prenume, int age, StudyLevel studyLevel, String numarMatricol) {
        this.id = id;
        this.nume = nume;
        this.prenume = prenume;
        this.age = age;
        this.studyLevel = studyLevel;
        this.numarMatricol = numarMatricol;
    }

    // Getters și Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public StudyLevel getStudyLevel() {
        return studyLevel;
    }

    public void setStudyLevel(StudyLevel studyLevel) {
        this.studyLevel = studyLevel;
    }

    public String getNumarMatricol() {
        return numarMatricol;
    }

    public void setNumarMatricol(String numarMatricol) {
        this.numarMatricol = numarMatricol;
    }
}