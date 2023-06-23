package com.note.controller;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.note.dto.NoteDTO;
import com.note.services.NoteMapperUtils;
import com.note.services.NoteService;

@RestController
@RequestMapping(path = "/note/api/v1")
@CrossOrigin(origins = {"http://127.0.0.1:5500", "http://localhost:3000"})
public class NoteController {
  @Autowired
  private NoteService noteService;

  @Autowired
  private NoteMapperUtils noteMapperUtils;

  @GetMapping(path = {"/", ""})
  public ResponseEntity<List<NoteDTO>> getAllNote() {
    List<NoteDTO> listNotesReverse = noteService.findAll()
                                                .stream()
                                                .map(i -> noteMapperUtils.convertToDTO(i))
                                                .collect(Collectors.toList());
    Collections.reverse(listNotesReverse);
    return ResponseEntity.status(HttpStatusCode.valueOf(200)).body(listNotesReverse);
  }

  @PostMapping(path = "")
  public ResponseEntity<NoteDTO> addNote(@RequestBody NoteDTO noteDTO) {
    return ResponseEntity.status(HttpStatus.OK).body(
      noteMapperUtils.convertToDTO(noteService.save(noteMapperUtils.convertToEntity(noteDTO)))
    );
  }

  @PutMapping(path = "/{id}")
  public ResponseEntity<List<NoteDTO>> updateNote(@PathVariable(name = "id") Integer id, @RequestBody NoteDTO noteDTO) {
    noteService.update(id, noteMapperUtils.convertToEntity(noteDTO));
    List<NoteDTO> listNotesReverse = noteService.findAll()
                                                .stream()
                                                .map(i -> noteMapperUtils.convertToDTO(i))
                                                .collect(Collectors.toList());
    Collections.reverse(listNotesReverse);
    return ResponseEntity.status(HttpStatus.OK).body(listNotesReverse);
  }

  @DeleteMapping(path = "/{id}")
  public ResponseEntity<NoteDTO> removeNote(@PathVariable(name = "id") Integer id) {
    return ResponseEntity.status(HttpStatus.OK).body(
      noteMapperUtils.convertToDTO(noteService.remove(id))
    );
  }
}
