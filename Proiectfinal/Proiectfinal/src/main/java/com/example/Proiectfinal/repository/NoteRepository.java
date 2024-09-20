package com.example.Proiectfinal.repository;

import com.example.Proiectfinal.entity.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {
    List<Note> findByGrupId(Long grupId);
}