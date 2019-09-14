package com.digital.resistance.dao;

import com.digital.resistance.domain.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomDao extends JpaRepository<Room, Long> {
}
