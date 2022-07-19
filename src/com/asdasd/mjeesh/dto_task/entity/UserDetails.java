package com.asdasd.mjeesh.dto_task.entity;

public class UserDetails {

    private final String login;
    private final String password;
    private final Long timestamp;

    public UserDetails() {
        login = null;
        password = null;
        timestamp = null;
    }

    public UserDetails(String login, String password, Long timestamp) {
        this.login = login;
        this.password = password;
        this.timestamp = timestamp;
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
