package com.asdasd.mjeesh.dto_task.controller;

import com.asdasd.mjeesh.dto_task.dto.UserDetailsDto;
import com.asdasd.mjeesh.dto_task.entity.UserDetails;
import com.asdasd.mjeesh.dto_task.mapper.UserDetailsMapper;
import com.asdasd.mjeesh.dto_task.service.UserDetailsService;

import java.util.List;

public class UserDetailsController {

    private final UserDetailsService userDetailsService;
    private final UserDetailsMapper userDetailsMapper;

    public UserDetailsController() {
        this.userDetailsMapper = new UserDetailsMapper();
        this.userDetailsService = new UserDetailsService();
    }

    public UserDetailsDto findByTimestamp(Long timestamp) {
        var result = userDetailsService.findByTimestamp(timestamp).orElse(new UserDetails());
        return userDetailsMapper.map(result);
    }

    public List<UserDetailsDto> findAll() {
        var result = this.userDetailsService.findAll();
        return this.userDetailsMapper.map(result);
    }
}
