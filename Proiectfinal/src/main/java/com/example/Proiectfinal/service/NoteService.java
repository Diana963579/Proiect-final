package com.example.Proiectfinal.service;

import com.example.Proiectfinal.entity.Note;
import com.example.Proiectfinal.exceptions.NoteNotFoundException;
import com.example.Proiectfinal.mappers.NoteMapper;
import com.example.Proiectfinal.repository.NoteRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class NoteService {

    private final NoteRepository noteRepository;
    private final NoteMapper noteMapper;
    private final StudentService studentService;
    private final CourseService courseService;

    public NoteService(NoteRepository noteRepository, NoteMapper noteMapper, StudentService studentService, CourseService courseService) {
        this.noteRepository = noteRepository;
        this.noteMapper = noteMapper;
        this.studentService = studentService;
        this.courseService = courseService;
    }

    public Note gasesteNotaDupaId(Long id) {
        return noteRepository.findById(id)
                .orElseThrow(() -> new NoteNotFoundException("Nota cu id-ul " + id + " nu a fost găsită"));
    }

    public List<Note> gasesteToateNotele() {
        List<Note> note = noteRepository.findAll();
        if (note.isEmpty()) {
            throw new NoteNotFoundException("Nu au fost găsite note.");
        }
        return note;
    }

    // Alte metode CRUD, unde excepția poate fi aruncată
    public Note adaugaNota(Note note) {
        return noteRepository.save(note);
    }
    public void stergeNota(Long id) {
        Note note = gasesteNotaDupaId(id); // Dacă nu e găsită, se aruncă excepția
        noteRepository.delete(note);
    }

    public NoteRepository getNoteRepository() {
        return noteRepository;
    }
}