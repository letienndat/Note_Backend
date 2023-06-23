package com.note.services;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.note.dto.NoteDTO;
import com.note.entity.Note;

@Service
public class NoteMapperUtils {
  @Autowired
  private ModelMapper modelMapper;

  public Note convertToEntity(NoteDTO noteDTO) {
    return modelMapper.map(noteDTO, Note.class);
  }

  public NoteDTO convertToDTO(Note note) {
    return modelMapper.map(note, NoteDTO.class);
  }
}
