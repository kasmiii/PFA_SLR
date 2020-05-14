package com.testspring.springtest.repositories;

import com.testspring.springtest.entities.Writing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface WritingRepository extends JpaRepository<Writing,Integer> {

    @Query("from Writing w where w.mIdWriting=?1")
     Writing getOne(int id);
}
