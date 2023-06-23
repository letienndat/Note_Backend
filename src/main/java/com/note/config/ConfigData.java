package com.note.config;

import java.util.Date;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.note.entity.Note;
import com.note.services.NoteService;

@Configuration
public class ConfigData {
  @Bean
  public CommandLineRunner initData(NoteService noteService) {
    return args -> {
      noteService.save(new Note("Tiền điện tháng 1", "Quạt: 50k\nĐiều hòa: 100k\nQuạt: 50k\nĐiều hòa: 100k", new Date()));
      noteService.save(new Note("Tiền điện tháng 2", "Quạt: 60k\nĐiều hòa: 130k", new Date()));
      noteService.save(new Note("Tiền điện tháng 3", "Quạt: 52k\nĐiều hòa: 200k\nQuạt: 50k\nĐiều hòa: 100k", new Date()));
      noteService.save(new Note("Tiền điện tháng 4", "Quạt: 45k\nĐiều hòa: 500k\nQuạt: 50k\nĐiều hòa: 100k", new Date()));
      noteService.save(new Note("Tiền điện tháng 5", "Quạt: 56k\nĐiều hòa: 560k", new Date()));
    };
  }
}
