package com.note.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.note.entity.Note;
import com.note.repositories.NoteRepository;

@Service
public class NoteServiceImpl implements NoteService {
  @Autowired
  private NoteRepository noteRepository;

  @Override
  public Note save(Note note) {
    return noteRepository.save(note);
  }

  @Override
  public List<Note> findAll() {
    return noteRepository.findAll();
  }

  @Override
  public Note update(Integer id, Note note) {
    Note noteFound = noteRepository.findById(id).get();
    noteFound.setTitle(note.getTitle());
    noteFound.setContent(note.getContent());

    return noteRepository.save(noteFound);
  }

  @Override
  public Note remove(Integer id) {
    Note noteFound = noteRepository.findById(id).get();
    noteRepository.deleteById(id);
    
    return noteFound;
  }
}
