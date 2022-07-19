package com.asdasd.mjeesh.dto_task.mapper;

import com.asdasd.mjeesh.dto_task.entity.UserDetails;
import com.asdasd.mjeesh.dto_task.dto.UserDetailsDto;

import java.util.List;
import java.util.stream.Collectors;

public class UserDetailsMapper implements Mapper<UserDetailsDto, UserDetails> {

    @Override
    public UserDetailsDto map(UserDetails from) {
        return new UserDetailsDto(
                from.getLogin(),
                from.getPassword(),
                from.getTimestamp()
        );
    }

    @Override
    public List<UserDetailsDto> map(List<UserDetails> fromList) {
        return fromList.stream()
                .map(userDetails -> new UserDetailsDto(
                        userDetails.getLogin(),
                        userDetails.getPassword(),
                        userDetails.getTimestamp()
                ))
                .collect(Collectors.toList());
    }
}
