package com.digital.resistance.service;

import com.digital.resistance.domain.UsersInRoom;

import java.util.List;

public interface UsersInRoomService {

    long findUserByRoomId(Long room_id);

    long findRoomByUserId(Long user_id);

    void save(UsersInRoom usersInRoom);

    UsersInRoom findUsersInRoomByUserIdAndRoomId(Long user_id, Long room_id);

    List<Long> findAllRoomsIdByUserId(Long user_id);

    List<Long> findAllUserIdByRoomId(Long room_id);
}
