package com.testspring.springtest.repositories;

import com.testspring.springtest.entities.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import java.util.List;


public interface ReviewRepository extends JpaRepository<Review,Integer> {

    @Query("select r from Review r where r.mIdReview=?1")
    Review findReviewById(int id);

    @Query("from Review r")
    List<Review> findAll();

    @Query("select r from Review r,Tagreview tr,Tag t \n" +
            "where r.mIdReview=tr.idReview \n" +
            "and tr.idTag=t.mIdTag\n" +
            "and t.mTagWord like %?1% ")
    List<Review> getReviewByTag(String tag);
}
