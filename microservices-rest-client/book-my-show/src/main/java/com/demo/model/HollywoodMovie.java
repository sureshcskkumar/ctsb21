package com.demo.model;

import java.time.LocalDate;

public class HollywoodMovie {
    private int id;
    private String title;
    private String director;
    // private double rating;
    private LocalDate released = LocalDate.now();

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return this.director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public LocalDate getReleased() {
        return this.released;
    }

    public void setReleased(LocalDate released) {
        this.released = released;
    }

    public HollywoodMovie id(int id) {
        setId(id);
        return this;
    }

    public HollywoodMovie title(String title) {
        setTitle(title);
        return this;
    }

    public HollywoodMovie director(String director) {
        setDirector(director);
        return this;
    }

    public HollywoodMovie released(LocalDate released) {
        setReleased(released);
        return this;
    }


    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", title='" + getTitle() + "'" +
            ", director='" + getDirector() + "'" +
            ", released='" + getReleased() + "'" +
            "}";
    }

}