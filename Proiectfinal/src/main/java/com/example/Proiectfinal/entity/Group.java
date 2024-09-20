package com.example.Proiectfinal.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String NumeGrup;
    private String codGrupa;

    @OneToMany(mappedBy = "grupa")
    private Student student;

    public Group(Long id, String codGrupa, Student student, String numeGrup) {
        this.id = id;
        this.codGrupa = codGrupa;
        this.NumeGrup = numeGrup;
        this.student = student;
    }

    public Group(Long id) {
        this.id = id;
    }

    public Group() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodGrupa() {
        return codGrupa;
    }

    public void setCodGrupa(String codGrupa) {
        this.codGrupa = codGrupa;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getNumeGrup() {
        return NumeGrup;
    }

    public void setNumeGrup(String numeGrup) {
        NumeGrup = numeGrup;
    }
}
