package com.digital.resistance.controller;

import com.digital.resistance.domain.Room;
import com.digital.resistance.domain.User;
import com.digital.resistance.domain.UsersInRoom;
import com.digital.resistance.service.RoomService;
import com.digital.resistance.service.UserService;
import com.digital.resistance.service.UsersInRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/room")
public class RoomController {

    @Autowired
    private RoomService roomService;

    @Autowired
    private UserService userService;

    @Autowired
    private UsersInRoomService usersInRoomService;

    @PostMapping("/enterroom")
    public RedirectView enterRoom(@RequestParam String phone,@RequestParam long room_id)
    {
        User user = userService.findUserByPhone(phone);
        Room room = roomService.findRoomById(room_id);
        UsersInRoom usersInRoom = new UsersInRoom(user.getUser_id(),room.getRoom_id(),room.getCount_price(),false);
        usersInRoomService.save(usersInRoom);
        return new RedirectView("/room/user?" + "user_id=" + user.getUser_id() + "&room_id=" + room_id);
    }

    @PostMapping("/createroom")
    public long createRoom(@ModelAttribute Room room, @RequestParam String phone) {
        roomService.createRoom(room);
        User user = userService.findUserByPhone(phone);
        UsersInRoom usersInRoom = new UsersInRoom(user.getUser_id(),room.getRoom_id(),room.getCount_price(),true);
        usersInRoomService.save(usersInRoom);
        return room.getRoom_id();
    }

    @GetMapping("/getroom")
    public RedirectView returnRedirect(@RequestParam String phone, @RequestParam Long room_id) {
        User user = userService.findUserByPhone(phone);
        UsersInRoom usersInRoom = usersInRoomService.findUsersInRoomByUserIdAndRoomId(user.getUser_id(), room_id);
        if (usersInRoom.isAdmin()) {
            return new RedirectView("/room/admin?" + "user_id=" + user.getUser_id() + "&room_id=" + room_id);
        } else {
            return new RedirectView("/room/user?" + "user_id=" + user.getUser_id() + "&room_id=" + room_id);
        }
    }

    @GetMapping("/user")
    public int returnPrice(@RequestParam Long user_id, @RequestParam Long room_id) {
        UsersInRoom usersInRoom = usersInRoomService.findUsersInRoomByUserIdAndRoomId(user_id, room_id);
        Room room = roomService.findRoomById(room_id);
        if(room.isEquivalently()) {
            usersInRoom.setPrice(room.getCount_price()/room.getCount_users());
            return usersInRoom.getPrice();
        } else {
            return usersInRoom.getPrice();
        }
    }

    @GetMapping("/allrooms")
    public List<Room> getAllRooms(@RequestParam String phone) {
        User user = userService.findUserByPhone(phone);
        List<Room> roomList = new ArrayList<>();
        List<Long> allRoomsId = usersInRoomService.findAllRoomsIdByUserId(user.getUser_id());
        for(Long id : allRoomsId){
            Room room = roomService.findRoomById(id);
            roomList.add(room);
        }
        return roomList;
    }

    @GetMapping("/admin")
    public Room getRoom(@RequestParam Long user_id, @RequestParam Long room_id) {
        Room room = roomService.findRoomById(room_id);
        return room;
    }

    @GetMapping("/abc")
    public String savesu() {
        User user = new User("zxc", "zxcv");
        Room room = new Room(3, 450, "fd");
        userService.addUser(user);
        roomService.createRoom(room);
        UsersInRoom usersInRoom = new UsersInRoom(user.getUser_id(), room.getRoom_id(), room.getCount_price(), false);
        usersInRoomService.save(usersInRoom);
        return "index";
    }
}
