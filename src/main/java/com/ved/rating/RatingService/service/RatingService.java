package com.ved.rating.RatingService.service;

import com.ved.rating.RatingService.model.Rating;

import javax.swing.event.ListDataEvent;
import java.util.List;

public interface RatingService {
    Rating create(Rating rating);

    List<Rating> getAllRatings();

    List<Rating> getAllRatingsByUserId(String userId);

    List<Rating> getAllRatingsByHotelId(String hotelId);
}
