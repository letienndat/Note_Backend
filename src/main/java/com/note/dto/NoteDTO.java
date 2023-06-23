package com.note.dto;

import java.util.Date;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Data
public class NoteDTO {
  private Integer id;
  private String title;
  private String content;
  private Date time;
}
