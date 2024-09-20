package com.example.Proiectfinal.entity;

import jakarta.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String numeCurs;

    @ManyToOne
    @JoinColumn(name = "profesor_id")
    private Teacher teacher;

    @ManyToMany(mappedBy = "cursuri", cascade = CascadeType.ALL)
    private Set<Note> note;

    public Course(Long id, String numeCurs, Teacher teacher, Set<Note> note) {
        this.id = id;
        this.numeCurs = numeCurs;
        this.teacher = teacher;
        this.note = note;
    }

    public Long getId() {
        return id;
    }

    public String getNumeCurs() {
        return numeCurs;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public Set<Note> getNote() {
        return note;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNumeCurs(String numeCurs) {
        this.numeCurs = numeCurs;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void setNote(Set<Note> note) {
        this.note = note;
    }
}
