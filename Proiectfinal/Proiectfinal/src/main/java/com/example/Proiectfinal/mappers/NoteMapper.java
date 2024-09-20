package com.example.Proiectfinal.mappers;

import com.example.Proiectfinal.dto.NoteDto;
import com.example.Proiectfinal.entity.Course;
import com.example.Proiectfinal.entity.Note;
import com.example.Proiectfinal.entity.Student;
import org.springframework.stereotype.Component;

@Component
public class NoteMapper {

    public NoteDto toDto(Note note) {
        NoteDto dto = new NoteDto();
        dto.setId(note.getId());
        dto.setValoare(note.getValoare());
        dto.setStudentId(note.getStudent().getId());  // presupunând că ai o relație ManyToOne cu Student
        dto.setCursId(note.getCourse().getId());        // presupunând că ai o relație ManyToOne cu Curs
        return dto;
    }

    public Note toEntity(NoteDto dto, Student student, Course course) {
        Note note = new Note();
        note.setId(dto.getId());
        note.setValoare(dto.getValoare());
        note.setStudent(student);  // presupunând că studentul este trecut ca argument
        note.setCourse(course);        // presupunând că cursul este trecut ca argument
        return note;
    }
}