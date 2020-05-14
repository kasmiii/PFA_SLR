package com.testspring.springtest.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Writing {


    /*
    *  id_writing number(3) NOT NULL,
    id_review number(3),
    id_author number(3),
    * */
    @Id
    @Column(name = "id_writing")
    private int mIdWriting;

    @Column(name = "id_review")
    private int mIdReview;

    @Column(name = "id_author")
    private int mIdAuthor;

    public Writing() {
    }

    public Writing(int mIdWriting, int mIdReview, int mIdAuthor) {
        this.mIdWriting = mIdWriting;
        this.mIdReview = mIdReview;
        this.mIdAuthor = mIdAuthor;
    }

    public int getmIdWriting() {
        return mIdWriting;
    }

    public void setmIdWriting(int mIdWriting) {
        this.mIdWriting = mIdWriting;
    }

    public int getmIdReview() {
        return mIdReview;
    }

    public void setmIdReview(int mIdReview) {
        this.mIdReview = mIdReview;
    }

    public int getmIdAuthor() {
        return mIdAuthor;
    }

    public void setmIdAuthor(int mIdAuthor) {
        this.mIdAuthor = mIdAuthor;
    }

    @Override
    public String toString() {
        return "Writing{" +
                "mIdWriting=" + mIdWriting +
                ", mIdReview=" + mIdReview +
                ", mIdAuthor=" + mIdAuthor +
                '}';
    }
}
