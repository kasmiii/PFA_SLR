package com.testspring.springtest.repositories;

import com.testspring.springtest.entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AuthorRepository extends JpaRepository<Author,Integer> {

    @Query("select a from Author a,Writing w,Review r " +
            "where a.id_author=w.mIdAuthor " +
            "and r.mIdReview=w.mIdReview" +
            " and r.mIdReview=:idreview")
    List<Author> getAuthorsByIdReview(@Param("idreview") int id);

}
