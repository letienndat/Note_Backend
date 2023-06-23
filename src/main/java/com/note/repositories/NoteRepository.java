package com.note.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.note.entity.Note;

@Repository
public interface NoteRepository extends JpaRepository<Note, Integer> {
  
}
