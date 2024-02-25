package com.example.Notes_work.repositories;

import com.example.Notes_work.models.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface NoteRepo extends JpaRepository<Note, Long> {
    Optional<Note> findById(Long id);
}
