package com.example.spring_sem11_hw.repository;

import com.example.spring_sem11_hw.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepo extends JpaRepository<Note, Long> {

//    Optional<Note> findById(Long id);
}
