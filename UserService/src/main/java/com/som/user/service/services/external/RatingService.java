package com.som.user.service.services.external;

import com.som.user.service.entities.Rating;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "RATINGSERVICE",path = "/ratings")
public interface RatingService {

    @GetMapping("/users/{userId}")
    List<Rating> getRatings(@PathVariable String userId);
}
