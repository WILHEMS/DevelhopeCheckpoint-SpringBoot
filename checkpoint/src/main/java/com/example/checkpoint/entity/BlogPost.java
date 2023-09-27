package com.example.checkpoint.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
@Entity
public class BlogPost {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String content;
    private String author;
    private LocalDate datePublished;
    // getters and setters


    public BlogPost(String title, String content, String author, LocalDate datePublished) {
        this.title = title;
        this.content = content;
        this.author = author;
        this.datePublished = datePublished;
    }

    public BlogPost() {
    }
}
