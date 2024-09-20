package com.example.Proiectfinal.dto;

public class NoteDto {
    private Long id;
    private Double valoare;
    private Long studentId;
    private Long cursId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getValoare() {
        return valoare;
    }

    public void setValoare(Double valoare) {
        this.valoare = valoare;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public Long getCursId() {
        return cursId;
    }

    public void setCursId(Long cursId) {
        this.cursId = cursId;
    }
}