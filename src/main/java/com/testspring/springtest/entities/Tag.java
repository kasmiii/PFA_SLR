package com.testspring.springtest.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Tag implements Serializable {

    @Id
    @Column(name = "id_tag")
    private int mIdTag;
    @Column(name = "tag_word")
    private String mTagWord;

    public Tag() {
    }

    public Tag(int idTag, String mTagWord) {
        this.mIdTag = idTag;
        this.mTagWord = mTagWord;
    }

    public int getIdTag() {
        return mIdTag;
    }

    public void setIdTag(int idTag) {
        this.mIdTag = idTag;
    }

    public String getmTagWord() {
        return mTagWord;
    }

    public void setmTagWord(String mTagWord) {
        this.mTagWord = mTagWord;
    }

    @Override
    public String toString() {
        return "Tag{" +
                "idTag=" + mIdTag +
                ", mTagWord='" + mTagWord + '\'' +
                '}';
    }
}
