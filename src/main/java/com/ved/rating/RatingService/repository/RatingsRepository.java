package com.ved.rating.RatingService.repository;

import com.ved.rating.RatingService.model.Rating;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RatingsRepository extends MongoRepository<Rating, String> {
}
