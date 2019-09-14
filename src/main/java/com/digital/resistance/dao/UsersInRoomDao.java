package com.digital.resistance.dao;

import com.digital.resistance.domain.Room;
import com.digital.resistance.domain.User;

public interface UsersInRoomDao {

    void saveUsersInRoom(User user, Room room, int price);
}
