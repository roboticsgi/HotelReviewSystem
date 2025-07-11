package com.user.service.entity;

import com.user.service.entity.Hotel.Hotel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Rating {

    private String ratingId;
    private String userId;
    private  String hotelId;
    private  int rating;
    private String feedback;
    private Hotel hotel;

}
