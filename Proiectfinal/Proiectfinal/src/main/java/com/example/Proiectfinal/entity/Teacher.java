package com.example.Proiectfinal.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nume;
    private String materie;

    @OneToMany(mappedBy = "profesor", cascade = CascadeType.ALL)
    private List<Course> cursuri;

    public Teacher(Long id, String nume, String materie, List<Course> cursuri) {
        this.id = id;
        this.nume = nume;
        this.materie = materie;
        this.cursuri = cursuri;
    }

    public Long getId() {
        return id;
    }

    public String getNume() {
        return nume;
    }

    public String getMaterie() {
        return materie;
    }

    public List<Course> getCursuri() {
        return cursuri;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setMaterie(String materie) {
        this.materie = materie;
    }

    public void setCursuri(List<Course> cursuri) {
        this.cursuri = cursuri;
    }
}
