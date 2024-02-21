package com.example.apiexemplo.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Book {

    public String title;
    public String author;
    public String area;
    public String publisher;
    @JsonProperty("year_of_publication") //snake case
    public String yearOfPublish; //camel case
    public String isbn;

}
