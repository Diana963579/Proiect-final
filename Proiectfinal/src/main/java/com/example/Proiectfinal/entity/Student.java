

package com.example.Proiectfinal.entity;

import com.example.Proiectfinal.enums.StudyLevel;
import jakarta.persistence.*;
import java.util.Set;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nume;
    private String prenume;
    private int age;
    private StudyLevel studyLevel;
    private String numarMatricol;

    @OneToOne
    @JoinColumn(name = "grupa_id")
    private Group group;

    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
    private Set<Note> note;

    public Student(Long id,String nume, String prenume,int age, StudyLevel studyLevel, String numarMatricol) {
        this.nume = nume;
        this.prenume = prenume;
        this.age = age;
        this.studyLevel = studyLevel;
        this.numarMatricol = numarMatricol;
    }

    public Long getId() {
        return id;
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public int getAge() {
        return age;
    }

    public StudyLevel getStudyLevel() {
        return studyLevel;
    }

    public String getNumarMatricol() {
        return numarMatricol;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public void setNumarMatricol(String numarMatricol) {
        this.numarMatricol = numarMatricol;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setStudyLevel(StudyLevel studyLevel) {
        this.studyLevel = studyLevel;
    }
}
