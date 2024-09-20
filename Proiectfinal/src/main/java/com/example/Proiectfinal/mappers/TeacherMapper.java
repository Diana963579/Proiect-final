package com.example.Proiectfinal.mappers;

import com.example.Proiectfinal.dto.TeacherDto;
import com.example.Proiectfinal.entity.Teacher;
import org.springframework.stereotype.Component;

@Component
public class TeacherMapper {

    public TeacherDto toDto(Teacher teacher) {
        TeacherDto dto = new TeacherDto();
        dto.setId(teacher.getId());
        dto.setNume(teacher.getNume());
        dto.setPrenume(teacher.getPrenume());
        dto.setTitlu(teacher.getTitlu());
        return dto;
    }

    public Teacher toEntity(TeacherDto dto) {
        Teacher teacher = new Teacher();
        teacher.setId(dto.getId());
        teacher.setNume(dto.getNume());
        teacher.setPrenume(dto.getPrenume());
        teacher.setTitlu(dto.getTitlu());
        return teacher;
    }
}