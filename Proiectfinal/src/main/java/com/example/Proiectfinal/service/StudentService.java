package com.example.Proiectfinal.service;

import com.example.Proiectfinal.entity.Student;
import com.example.Proiectfinal.enums.StudyLevel;
import com.example.Proiectfinal.repository.StudentRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentService {

    public Student creeazaStudent(Long id, String nume, String prenume, int age, StudyLevel studyLevel, String numarMatricol) {
        // Creează un obiect Student folosind parametrii primiți
        return new Student(id, nume, prenume, age, studyLevel,numarMatricol);
    }
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student getStudentById(Long id) {
        return studentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found with id " + id));
    }

    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    public Student updateStudent(Long id, Student studentDetails) {
        Student student = getStudentById(id);
        student.setNume(studentDetails.getNume());
        student.setPrenume(studentDetails.getPrenume());
        student.setNumarMatricol(studentDetails.getNumarMatricol());
        return studentRepository.save(student);
    }

    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }
}
