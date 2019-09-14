package com.digital.resistance.service;

import com.digital.resistance.domain.Room;
import com.digital.resistance.domain.User;

public interface UsersInRoomService {

    void addUserInRoom(User user, Room room, int price);
}
