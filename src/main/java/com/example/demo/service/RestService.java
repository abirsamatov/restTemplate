package com.example.demo.service;

import com.example.demo.model.User;

public interface RestService {
    String getAllUsers();

    String addUser(User user, String session);

    String updateUser(User user, String session);

    String deleteUser(User user, String session, Long id);
}
