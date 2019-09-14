package com.digital.resistance.controller;

import com.digital.resistance.domain.Room;
import com.digital.resistance.service.RoomService;
import com.digital.resistance.service.UserService;
import com.digital.resistance.service.UsersInRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/createroom")
public class RoomController {

    @Autowired
    private RoomService roomService;

    @Autowired
    private UserService userService;

    @Autowired
    private UsersInRoomService usersInRoomService;

    @PostMapping
    public void saveRoom(Room room) {
        roomService.createRoom(room);

    }

    @GetMapping
    public Room getRoom() {
        Room room = new Room(1,2,"as");
        return room;
    }

}
