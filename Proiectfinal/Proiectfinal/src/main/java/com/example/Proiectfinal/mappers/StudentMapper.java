package com.example.Proiectfinal.mappers;

import com.example.Proiectfinal.dto.StudentDto;
import com.example.Proiectfinal.entity.Student;

public class StudentMapper {

    // Metodă pentru a transforma un Student în StudentDTO
    public static StudentDto toDTO(Student student) {
        if (student == null) {
            return null;
        }
        return new StudentDto(student.getId(), student.getNume(), student.getPrenume(), student.getAge(), student.getStudyLevel(), student.getNumarMatricol());
    }

    // Metodă pentru a transforma un StudentDTO în Student
    public static Student toEntity(StudentDto studentDTO) {
        if (studentDTO == null) {
            return null;
        }
        return new Student(studentDTO.getId(), studentDTO.getNume(), studentDTO.getPrenume(), studentDTO.getAge(), null,studentDTO.getNumarMatricol());
        // Aici, nivelStudiu este null, pentru că nu este parte din DTO.
    }
}