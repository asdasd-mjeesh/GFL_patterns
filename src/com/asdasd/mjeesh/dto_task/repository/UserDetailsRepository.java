package com.asdasd.mjeesh.dto_task.repository;

import com.asdasd.mjeesh.dto_task.entity.UserDetails;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserDetailsRepository {

    private final List<UserDetails> userDetailsList;

    public UserDetailsRepository() {
        this.userDetailsList = new ArrayList<>(List.of(
                new UserDetails("login1", "password1", 1L),
                new UserDetails("login2", "password2", 2L),
                new UserDetails("login3", "password3", 3L),
                new UserDetails("login4", "password4", 4L),
                new UserDetails("login5", "password5", 5L),
                new UserDetails("login6", "password6", 6L),
                new UserDetails("login7", "password7", 7L),
                new UserDetails("login8", "password8", 8L),
                new UserDetails("login9", "password9", 9L)
        ));
    }

    public Optional<UserDetails> findByTimestamp(Long timestamp) {
        return userDetailsList.stream()
                .filter(userDetails -> userDetails.getTimestamp().equals(timestamp))
                    .findFirst();
    }

    public List<UserDetails> findAll() {
        return userDetailsList;
    }
}
