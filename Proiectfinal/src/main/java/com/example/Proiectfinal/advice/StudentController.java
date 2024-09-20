package com.example.Proiectfinal.advice;

import com.example.Proiectfinal.dto.StudentDto;
import com.example.Proiectfinal.entity.Student;
import com.example.Proiectfinal.enums.StudyLevel;
import com.example.Proiectfinal.mappers.StudentMapper;
import com.example.Proiectfinal.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping({"/api/studenti", "/studenti"})

public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public ResponseEntity<List<Student>> getAllStudents() {
        List<Student> studenti = studentService.getAllStudents();
        return new ResponseEntity<>(studenti, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Student> addStudent(@RequestBody Student student) {
        Student newStudent = studentService.addStudent(student);
        return new ResponseEntity<>(newStudent, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable("id") Long id) {
        Student student = studentService.getStudentById(id);
        return new ResponseEntity<>(student, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable("id") Long id, @RequestBody Student studentDetails) {
        Student updatedStudent = studentService.updateStudent(id, studentDetails);
        return new ResponseEntity<>(updatedStudent, HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable("id") Long id) {
        studentService.deleteStudent(id);
        return new ResponseEntity<>("Student deleted successfully", HttpStatus.OK);
    }
    @PostMapping("/adauga")
    public StudentDto adaugaStudent(@RequestBody StudentDto studentDTO) {
        // Conversie din DTO în entitate
        Student student = StudentMapper.toEntity(studentDTO);
        // Adăugăm studentul folosind un service (opțional, dacă implementezi un service)
        Student studentSalvat = studentService.creeazaStudent(student.getId(), student.getNume(), student.getPrenume(), student.getAge(), student.getStudyLevel(),student.getNumarMatricol());
        // Returnăm DTO-ul corespunzător
        return StudentMapper.toDTO(studentSalvat);
    }

    @GetMapping("/exemplu")
    public StudentDto exempluStudent() {
        // Creează un obiect Student pentru exemplu
        Student student = new Student(1L, "Ion", "Popescu", 22, StudyLevel.LICENTA,"CIG");
        // Conversie din entitate în DTO și returnare
        return StudentMapper.toDTO(student);
    }
}
