package com.som.user.service.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name="micro_users")
public class User {

    @Id //primary key in database table
    @Column(name = "ID")
    private String userId;
    @Column(name = "NAME",length = 20) //it will have validation as length should not exceed 20
    private String name;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "ABOUT")
    private String about;

    @Transient //this will not store in database
    private List<Rating> ratings = new ArrayList<>();
}
