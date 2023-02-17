package com.example.Student.Library.Management.System.Models;

import com.example.Student.Library.Management.System.Enums.Genre;
import jakarta.persistence.*;

@Entity
@Table(name = "book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id; //Auto generated
    private String name; //PM 1
    private int pages; //PM 2
    @Enumerated(value = EnumType.STRING)
    private Genre genre; //PM 2

    private Double rating; // PM 4
    private boolean isIssued;

    //Book is child wrt Author
    //so setting here foreign key : Standard 3 Steps
    @ManyToOne // s1 :  Many Books -> One Author
    @JoinColumn //s2 : Add an extra attribute of authorId (Parent table PK) for the foreign key of child
    private Author author;

    //Book is child wrt Card
    //Many book -> One Card
    @ManyToOne
    @JoinColumn
    private Card card;


    public Book() {
        isIssued=false;
    }

    public boolean isIssued() {
        return isIssued;
    }

    public void setIssued(boolean issued) {
       // isIssued = issued;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }
}
