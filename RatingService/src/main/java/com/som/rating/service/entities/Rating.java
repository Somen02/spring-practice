package com.som.rating.service.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//this will be fetched from other microservice
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Rating {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ratingId;
    private String userId;
    private String hotelId;
    private int rating;
    private String feedback;
}
