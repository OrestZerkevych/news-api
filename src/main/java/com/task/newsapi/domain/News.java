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

//    public News(String title, String text, String date) {
//        this.title = title;
//        this.text = text;
//        this.date = date;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public String getText() {
//        return text;
//    }
//
//    public void setText(String text) {
//        this.text = text;
//    }
//
//    public String getDate() {
//        return date;
//    }
//
//    public void setDate(String date) {
//        this.date = date;
//    }
//
//    @Override
//    public String toString() {
//        return "News{" +
//                "id=" + id +
//                ", title='" + title + '\'' +
//                ", text='" + text + '\'' +
//                ", date='" + date + '\'' +
//                '}';
//    }
}
