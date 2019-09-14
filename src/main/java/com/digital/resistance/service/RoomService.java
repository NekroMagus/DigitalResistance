package com.digital.resistance.service;

import com.digital.resistance.domain.Room;

public interface RoomService {

    void createRoom(Room room);

    Room findRoomById(long id);
}
