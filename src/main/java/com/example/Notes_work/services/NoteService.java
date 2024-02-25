package com.example.Notes_work.services;

import com.example.Notes_work.models.Note;

import java.util.List;

public interface NoteService {
    List<Note> getAllNotes();
     Note createNote(Note note);
     Note getNoteById(Long id);
     Note updateNote(Long id,String changeHeading,String changeContent);
     void deleteNote(Long id);


}
