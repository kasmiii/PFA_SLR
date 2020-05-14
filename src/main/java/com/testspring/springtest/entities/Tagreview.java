package com.testspring.springtest.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Tagreview {

    @Id
    @Column(name = "id_tagreview")
    private int idTagReview;
    @Column(name = "id_review")
    private String idReview;
    @Column(name = "id_tag")
    private String idTag;

    public Tagreview() {
    }

    public Tagreview(int idTagReview, String idReview, String idTag) {
        this.idTagReview = idTagReview;
        this.idReview = idReview;
        this.idTag = idTag;
    }

}
