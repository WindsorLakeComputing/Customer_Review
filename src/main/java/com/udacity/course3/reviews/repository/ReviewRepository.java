package com.udacity.course3.reviews.repository;

import com.udacity.course3.reviews.model.Review;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ReviewRepository extends CrudRepository<Review, Integer> {

    Optional<Review> findByReviewId(Integer productId);
    Optional<Review> findByContent(String content);

}