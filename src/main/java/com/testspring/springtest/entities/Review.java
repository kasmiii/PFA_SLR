package com.testspring.springtest.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.io.Serializable;
import java.util.List;

@Entity
public class Review {

    @Id
    @Column(name = "id_review")
    private int mIdReview;
    @Column(name = "title")
    private String mTitle;
    @Column(name = "database_review")
    private String mDatabaseReview;
    @Column(name = "date_publication")
    private String mDatePublication;
    @Column(name = "link")
    private String mLink;

    @Transient
    private List<Author> mListAuthors;

    public Review() {
        mListAuthors=null;
    }

    public Review(int id_review, String title, String database_review, String date_publication, String link) {
        this.mIdReview = id_review;
        this.mTitle = title;
        this.mDatabaseReview = database_review;
        this.mDatePublication = date_publication;
        this.mLink = link;
    }

    public int getId_review() {
        return mIdReview;
    }

    public void setId_review(int id_review) {
        this.mIdReview = id_review;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        this.mTitle = title;
    }

    public String getDatabase_review() {
        return mDatabaseReview;
    }

    public void setDatabase_review(String database_review) {
        this.mDatabaseReview = database_review;
    }

    public String getDate_publication() {
        return mDatePublication;
    }

    public void setDate_publication(String date_publication) {
        this.mDatePublication = date_publication;
    }

    public String getLink() {
        return mLink;
    }

    public void setLink(String link) {
        this.mLink = link;
    }

    public List<Author> getmListAuthors() {
        return mListAuthors;
    }

    public void setmListAuthors(List<Author> mListAuthors) {
        this.mListAuthors = mListAuthors;
    }

    @Override
    public String toString() {
        return "Review{" +
                "mIdReview=" + mIdReview +
                ", mTitle='" + mTitle + '\'' +
                ", mDatabaseReview='" + mDatabaseReview + '\'' +
                ", mDatePublication='" + mDatePublication + '\'' +
                ", mLink='" + mLink + '\'' +
                '}';
    }
}
