package org.example.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;

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
    @NotBlank(message = "Invalid input")
    private String name;

    @Column(name = "year")
    @NotNull(message = "Invalid input")
    @Positive(message = "Invalid input")
    private Long year;

    @Column(name = "director")
    @NotBlank(message = "Invalid input")
    @Pattern(regexp = "^[A-Za-zА-Яа-я .'-]+$", message = "Invalid input")
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
