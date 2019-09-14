package com.digital.resistance.service.impl;

import com.digital.resistance.dao.UsersInRoomDao;
import com.digital.resistance.domain.Room;
import com.digital.resistance.domain.User;
import com.digital.resistance.service.UsersInRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersInRoomServiceImpl implements UsersInRoomService {

    @Autowired
    private UsersInRoomDao usersInRoomDao;

    @Override
    public void addUserInRoom(User user, Room room, int price) {
        usersInRoomDao.saveUsersInRoom(user,room,price);
    }
}
