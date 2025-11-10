package com.ved.rating.RatingService.service.impl;

import com.ved.rating.RatingService.model.Rating;
import com.ved.rating.RatingService.repository.RatingsRepository;
import com.ved.rating.RatingService.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RatingsServiceImpl implements RatingService {

    @Autowired
    private RatingsRepository ratingsRepository;

    @Override
    public Rating create(Rating rating) {
        return ratingsRepository.save(rating);
    }

    @Override
    public List<Rating> getAllRatings() {
        return ratingsRepository.findAll();
    }

    @Override
    public List<Rating> getAllRatingsByUserId(String userId) {
        return ratingsRepository.findByUserId(userId);
    }

    @Override
    public List<Rating> getAllRatingsByHotelId(String hotelId) {
        return ratingsRepository.findByHotelId(hotelId);
    }
}
