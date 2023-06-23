package com.note.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "notes")
public class Note {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false, columnDefinition = "int")
  private Integer id;
  
  @Column(name = "title", columnDefinition = "text")
  private String title;
  
  @Column(name = "content", columnDefinition = "longtext")
  private String content;

  @Column(name = "time", nullable = false, columnDefinition = "datetime")
  private Date time;

  public Note(String title, String content, Date time) {
    this.title = title;
    this.content = content;
    this.time = time;
  }
}
