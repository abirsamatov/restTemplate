package com.example.demo;

import com.example.demo.model.User;
import com.example.demo.service.RestService;
import com.example.demo.service.impl.RestServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    private static final RestService restService = new RestServiceImpl();

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);

        User user = new User(3L, "James", "Brown", (byte) 22);
        User updatedUser = new User(3L, "Thomas", "Shelby", (byte) 22);

        String session = restService.getAllUsers();
        System.out.println(restService.addUser(user, session));
        System.out.println(restService.updateUser(updatedUser, session));
        System.out.println(restService.deleteUser(updatedUser, session, user.getId()));
    }
}
