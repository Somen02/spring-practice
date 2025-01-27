package com.som.hotel.service.services;

import com.som.hotel.service.entities.Hotel;

import java.util.List;

public interface HotelService {

    //create
    Hotel createHotel(Hotel hotel);

    //get all hotels
    List<Hotel> getAllHotels();

    //get single hotel
    Hotel getHotel(String id);
}
