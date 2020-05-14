package com.testspring.springtest.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Author implements Serializable {

    @Id
    private int id_author;
    private String author_name;


    public Author() {
    }

    public Author(int id_author, String author_name) {
        this.id_author = id_author;
        this.author_name = author_name;
    }

    public int getId_author() {
        return id_author;
    }

    public void setId_author(int id_author) {
        this.id_author = id_author;
    }

    public String getAuthor_name() {
        return author_name;
    }

    public void setAuthor_name(String author_name) {
        this.author_name = author_name;
    }
}
