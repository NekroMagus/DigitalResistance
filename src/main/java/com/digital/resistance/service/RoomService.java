package com.digital.resistance.service;

import com.digital.resistance.domain.Room;

import java.util.List;

public interface RoomService {

    void createRoom(Room room);

    Room findRoomById(long id);

    List<Room> findAllRooms();
}
