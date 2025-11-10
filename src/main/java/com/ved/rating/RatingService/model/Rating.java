package com.ved.rating.RatingService.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Document("user-ratings")
public class Rating {
    @Id
    private String ratingsId;
    private String userId;
    private String hotelId;
    private int rating;
    private String feedback;
}
