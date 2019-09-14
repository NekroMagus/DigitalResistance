package com.digital.resistance.controller;

import com.digital.resistance.domain.Room;
import com.digital.resistance.domain.User;
import com.digital.resistance.service.RoomService;
import com.digital.resistance.service.UserService;
import com.digital.resistance.service.UsersInRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

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
    public void saveRoom(@RequestParam Room room) {
        roomService.createRoom(room);
    }

    @GetMapping
    public List<Room> getRoom() {
        List<Room> roomList = roomService.findAllRooms();
        return roomList;
    }


    @GetMapping("/create")
    public String get() {
        User user = new User("hkk","cj");
        userService.addUser(user);
        return "index";
    }
}
