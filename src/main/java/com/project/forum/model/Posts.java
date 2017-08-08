package com.project.forum.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Document(collection = "Posts")
public class Posts {

    @Id
    private String id;
    private boolean main;
    private String title;
    private String author;
    private LocalDate date;
    private boolean closed;
    private String content;
    private List<Posts> posts;
    private int score;

    protected Posts(){}
    public Posts(boolean main, String title, String author, String content) {
        this.main = main;
        this.title = title;
        this.author = author;
        this.date = LocalDate.now();
        this.closed = false;
        this.content = content;
        this.posts = new ArrayList<>();
        this.score = 0;
    }
}
