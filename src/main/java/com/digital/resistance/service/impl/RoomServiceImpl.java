package com.digital.resistance.service.impl;

import com.digital.resistance.dao.RoomDao;
import com.digital.resistance.domain.Room;
import com.digital.resistance.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoomServiceImpl implements RoomService {

    @Autowired
    private RoomDao roomDao;


    @Override
    public void createRoom(Room room) {
        roomDao.save(room);
    }

    @Override
    public Room findRoomById(long id) {
        return roomDao.findById(id).get();
    }
}
