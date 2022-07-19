package com.asdasd.mjeesh.dto_task;

import com.asdasd.mjeesh.dto_task.controller.UserDetailsController;

public class MainBootApplication {

    private final UserDetailsController userDetailsController;

    public MainBootApplication() {
        this.userDetailsController = new UserDetailsController();
    }

    public static void main(String[] args) {
        new MainBootApplication().run();
    }

    private void run() {
        System.out.println(this.userDetailsController.findAll());
        System.out.println(this.userDetailsController.findByTimestamp(1L));
    }
}
