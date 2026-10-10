package org.example.model;

import javax.persistence.*;

@Entity
@Table(name = "movies")

public class Movie {

    public Movie(){}

    public Movie(String name, Long year, String director) {
        this.name = name;
        this.year = year;
        this.director = director;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "year")
    private Long year;

    @Column(name = "director")
    private String director;


    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Long getYear() {
        return year;
    }

    public String getDirector() {return director;}

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(Long year) {
        this.year = year;
    }

    public void setDirector(String director) {this.director = director;}
}
