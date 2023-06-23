package com.note.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.note.entity.Note;

@Service
public interface NoteService {
  Note save(Note note);
  List<Note> findAll();
  Note update(Integer id, Note note);
  Note remove(Integer id);
}
