package com.example.aziz.models;

import javax.persistence.Entity;
        import javax.persistence.GeneratedValue;
        import javax.persistence.GenerationType;
        import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class Post {

    @GeneratedValue(strategy=GenerationType.AUTO)
    @Id private Long id;
    private String anons;
    private String full_text;
    private String title;
    private int views;
    public Post(){}
    public Post(String title, String anons, String full_text) {
        this.anons = anons;
        this.title = title;
        this.full_text = full_text; }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAnons() {
        return anons;
    }

    public void setAnons(String anons) {
        this.anons = anons;
    }

    public String getFull_text() {
        return full_text;
    }

    public void setFull_text(String full_text) {
        this.full_text = full_text;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }
}