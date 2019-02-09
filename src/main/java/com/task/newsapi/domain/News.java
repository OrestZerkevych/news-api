package com.task.newsapi.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class News {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;
    private String text;
    private String date;

    public News() {}
}
