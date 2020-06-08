package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksController {

  @ResponseStatus(HttpStatus.OK)
  @GetMapping(value = "/books", produces = MediaType.APPLICATION_JSON_VALUE)
  public String book () {
    return "Hellow World";
  }
}
