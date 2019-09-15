package com.digital.resistance.dao;

import com.digital.resistance.domain.Room;
import com.digital.resistance.domain.UsersInRoom;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UsersInRoomDao extends JpaRepository<UsersInRoom, Long> {

    long findUserusByRoomus(Long room_id);

    long findRoomusByUserus(Long user_id);

    UsersInRoom findUsersInRoomByUserusAndRoomus(Long user_id, Long room_id);

    List<Long> findAllRoomusByUserus(Long user_id);

    List<Long> findAllUserusByRoomus(Long room_id);
}
