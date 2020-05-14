package com.testspring.springtest.controllers;

import com.testspring.springtest.entities.Author;
import com.testspring.springtest.entities.Review;
import com.testspring.springtest.entities.Writing;
import com.testspring.springtest.repositories.AuthorRepository;
import com.testspring.springtest.repositories.ReviewRepository;
import com.testspring.springtest.repositories.WritingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ReviewController {

    @Autowired
    private ReviewRepository reviewRepository;
    @Autowired
    private WritingRepository writingRepository;
    @Autowired
    private AuthorRepository authorRepository;

    @GetMapping(path = "/review/{id}")
    @ResponseBody
    public Review review(@PathVariable("id") int id){
        return reviewRepository.findReviewById(id);
    }

    @GetMapping(path="/reviews")
    @ResponseBody
    public List<Review> getAllReview(){
        return reviewRepository.findAll();
    }

    @GetMapping(path = "/reviewtag/{tagname}")
    @ResponseBody
    public List<Review> getReviewByTag(@PathVariable("tagname") String tag){
        List<Review> reviewList=reviewRepository.getReviewByTag(tag);
        for (Review r:reviewList){
            r.setmListAuthors(authorRepository.getAuthorsByIdReview(r.getId_review()));
        }
        return reviewList;
    }

    @GetMapping(path="/writing/{id}")
    @ResponseBody
    public Writing getAllReview(@PathVariable("id") int id){
        return writingRepository.getOne(id);
    }

    @GetMapping(path = "/reviewAuthor/{id}")
    @ResponseBody
    List<Author> getAuthors(@PathVariable("id") int id){
        return authorRepository.getAuthorsByIdReview(id);
    }

}
