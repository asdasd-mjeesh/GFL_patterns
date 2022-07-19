package com.asdasd.mjeesh.dto_task.service;

import com.asdasd.mjeesh.dto_task.entity.UserDetails;
import com.asdasd.mjeesh.dto_task.repository.UserDetailsRepository;

import java.util.List;
import java.util.Optional;

public class UserDetailsService {

    private final UserDetailsRepository userDetailsRepository;

    public UserDetailsService() {
        this.userDetailsRepository = new UserDetailsRepository();
    }

    public Optional<UserDetails> findByTimestamp(Long timestamp) {
        return this.userDetailsRepository.findByTimestamp(timestamp);
    }

    public List<UserDetails> findAll() {
        return this.userDetailsRepository.findAll();
    }
}
