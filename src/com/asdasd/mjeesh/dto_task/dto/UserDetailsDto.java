package com.asdasd.mjeesh.dto_task.dto;

public class UserDetailsDto {

    private final String login;
    private final String password;
    private final Long timestamp;

    public UserDetailsDto(String login, String password, Long timestamp) {
        this.login = login;
        this.password = password;
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "UserDetailsDto{" +
               "login='" + login + '\'' +
               ", password='" + password + '\'' +
               ", timestamp=" + timestamp +
               '}';
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public Long getTimestamp() {
        return timestamp;
    }
}
