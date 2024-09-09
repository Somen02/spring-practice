package com.som.user.service.services.impl;

import com.som.user.service.entities.User;
import com.som.user.service.exceptions.ResourceNotFoundException;
import com.som.user.service.repositories.UserRepository;
import com.som.user.service.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

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
        return userRepository.findById(usreId)
                .orElseThrow(()->new ResourceNotFoundException("User with given id is not found on server!!: "+usreId));
        //this exception needs to be handled globally
    }

    @Override
    public User updateUser(User user) {
        return null;
    }

    @Override
    public void deletUser(String userId) {

    }
}
