package com.example.Proiectfinal.repository;

import com.example.Proiectfinal.entity.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository

public interface NoteRepository extends JpaRepository<Note, Long> {

    // Găsește toate notele pentru un student specific
    List<Note> findByStudentId(Long studentId);

    // Găsește toate notele pentru un curs specific
    List<Note> findByCursId(Long cursId);

    // Găsește toate notele pentru un student și un curs specific
    List<Note> findByStudentIdAndCursId(Long studentId, Long cursId);

    // Găsește toate notele mai mari sau egale cu o anumită valoare
    List<Note> findByValoareGreaterThanEqual(int valoare);

    // Găsește toate notele mai mici decât o anumită valoare
    List<Note> findByValoareLessThan(int valoare);
}