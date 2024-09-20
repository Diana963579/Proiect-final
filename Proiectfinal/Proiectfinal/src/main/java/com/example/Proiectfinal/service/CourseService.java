package com.example.Proiectfinal.service;

import com.example.Proiectfinal.entity.Course;
import com.example.Proiectfinal.exceptions.CourseNotFoundException;
import com.example.Proiectfinal.repository.CourseRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CourseService {

    private final CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public Course gasesteCursDupaId(Long id) {
        return courseRepository.findById(id)
                .orElseThrow(() -> new CourseNotFoundException("Cursul cu id-ul " + id + " nu a fost găsit"));
    }

    // Alte metode...
}