package com.som.user.service.services.impl;

import com.som.user.service.entities.Hotel;
import com.som.user.service.entities.Rating;
import com.som.user.service.entities.User;
import com.som.user.service.exceptions.ResourceNotFoundException;
import com.som.user.service.repositories.UserRepository;
import com.som.user.service.services.UserService;
import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate;

    private Log log= LogFactory.getLog(UserServiceImpl.class);

    @Override
    public User saveUser(User user) {
        String uuid = UUID.randomUUID().toString();
        user.setUserId(uuid);
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User getUser(String usreId) {

        User user =userRepository.findById(usreId)
                .orElseThrow(()->new ResourceNotFoundException("User with given id is not found on server!!: "+usreId));//this exception needs to be handled globally

        //call to rating service to fetch ratings

//        ArrayList<Rating> ratingForUser = restTemplate.getForObject("http://localhost:8083/ratings/users/" + user.getUserId(),ArrayList.class);

        //in the above format use Rating[].class instead of arraylist
        //below when we use exchange the directly we can pass  new ParameterizedTypeReference<List<Rating>>() {
        //        }
        ResponseEntity<List<Rating>> exchange = restTemplate.exchange("http://RATINGSERVICE/ratings/users/" + user.getUserId(), HttpMethod.GET, null, new ParameterizedTypeReference<List<Rating>>() {
        });
        ArrayList<Rating> ratingForUser = (ArrayList<Rating>) exchange.getBody();

        List<Rating> ratingForUserWithHotel = ratingForUser.stream().map(rating -> {
            ResponseEntity<Hotel> hotelResponseEntity = restTemplate.getForEntity("http://HOTELSERVICE/hotels/" + rating.getHotelId(), Hotel.class);
            Hotel hotel = hotelResponseEntity.getBody();
            rating.setHotel(hotel);
            return rating;
        }).collect(Collectors.toList());

        log.info("user rating:- "+ratingForUser);
        user.setRatings(ratingForUserWithHotel);

        return user;

    }

    @Override
    public User updateUser(User user) {
        return null;
    }

    @Override
    public void deletUser(String userId) {

    }
}
