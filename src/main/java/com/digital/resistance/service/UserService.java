package com.digital.resistance.service;

import com.digital.resistance.domain.User;

public interface UserService {

    void addUser(User user);

    void removeUser(User user);

    User findUserById(long id);

    User findUserByPhone(String phone);
}
