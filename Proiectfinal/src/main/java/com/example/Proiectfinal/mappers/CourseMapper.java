package com.example.Proiectfinal.mappers;

import com.example.Proiectfinal.dto.CourseDto;
import com.example.Proiectfinal.entity.Course;
import com.example.Proiectfinal.entity.Teacher;
import org.springframework.stereotype.Component;

@Component
public class CourseMapper {

    public CourseDto toDto(Course course) {
        CourseDto dto = new CourseDto();
        dto.setId(course.getId());
        dto.setNumeCurs(course.getNumeCurs());
        dto.setProfesorId(course.getTeacher().getId());  // presupunând că ai o relație ManyToOne cu Profesor
        return dto;
    }

    public Course toEntity(CourseDto dto, Teacher teacher) {
        Course course = new Course();
        course.setId(dto.getId());
        course.setNumeCurs(dto.getNumeCurs());
        course.setTeacher(teacher);  // presupunând că profesorul este trecut ca argument
        return course;
    }
}