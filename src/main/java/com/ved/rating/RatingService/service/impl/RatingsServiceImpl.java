package com.ved.rating.RatingService.service.impl;

import com.ved.rating.RatingService.model.Rating;
import com.ved.rating.RatingService.service.RatingService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RatingsServiceImpl implements RatingService {
    @Override
    public Rating create(Rating rating) {
        return null;
    }

    @Override
    public List<Rating> getAllRatings() {
        return List.of();
    }

    @Override
    public List<Rating> getAllRatingsByUserId(String userId) {
        return List.of();
    }

    @Override
    public List<Rating> getAllRatingsByHotelId(String hotelId) {
        return List.of();
    }
}
