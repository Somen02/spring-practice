package com.som.hotel.service.services.impl;

import com.som.hotel.service.entities.Hotel;
import com.som.hotel.service.exceptions.ResourceNotFoundException;
import com.som.hotel.service.repositories.HotelRepository;
import com.som.hotel.service.services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    private HotelRepository repository;

    @Override
    public Hotel createHotel(Hotel hotel) {
        String id = UUID.randomUUID().toString();
        hotel.setId(id);
        return repository.save(hotel);
    }

    @Override
    public List<Hotel> getAllHotels() {
        return repository.findAll();
    }

    @Override
    public Hotel getHotel(String id) {
        return repository.findById(id)
                .orElseThrow(()->new ResourceNotFoundException("Hotel with given id not found"));
    }
}
