package com.digital.resistance.service.impl;

import com.digital.resistance.dao.UsersInRoomDao;
import com.digital.resistance.domain.UsersInRoom;
import com.digital.resistance.service.UsersInRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersInRoomServiceImpl implements UsersInRoomService {

    @Autowired
    private UsersInRoomDao usersInRoomDao;

    @Override
    public long findUserByRoomId(Long room_id) {
        return usersInRoomDao.findUserusByRoomus(room_id);
    }

    @Override
    public long findRoomByUserId(Long user_id) {
        return usersInRoomDao.findRoomusByUserus(user_id);
    }

    @Override
    public void save(UsersInRoom usersInRoom) {
        usersInRoomDao.save(usersInRoom);
    }

    @Override
    public UsersInRoom findUsersInRoomByUserIdAndRoomId(Long user_id,Long room_id) {
        return usersInRoomDao.findUsersInRoomByUserusAndRoomus(user_id, room_id);
    }

    @Override
    public List<Long> findAllRoomsIdByUserId(Long user_id) {
        return usersInRoomDao.findAllRoomusByUserus(user_id);
    }
}
