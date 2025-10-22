package com.appdev.furluv.pacanag3.repository;

import com.appdev.furluv.pacanag3.entity.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<PostEntity, Long> {
}
