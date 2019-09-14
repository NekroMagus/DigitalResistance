package com.digital.resistance.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "room")
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "room_id")
    private long room_id;

    @Column(name = "count_users")
    private int count_users;

    @Column(name = "count_price")
    private int count_price;

    @Column(name = "name")
    private String name;

    @ElementCollection
//    @JoinTable(name = "users",
//    joinColumns = @JoinColumn(name = "user_id"))
    private List<UsersInRoom> usersInRoomList;

    public Room() {
    }

    public Room(int count_users, int count_price, String name) {
        this.count_users = count_users;
        this.count_price = count_price;
        this.name = name;
    }


    public long getRoom_id() {
        return room_id;
    }

    public void setRoom_id(long room_id) {
        this.room_id = room_id;
    }

    public int getCount_users() {
        return count_users;
    }

    public void setCount_users(int count_users) {
        this.count_users = count_users;
    }

    public int getCount_price() {
        return count_price;
    }

    public void setCount_price(int count_price) {
        this.count_price = count_price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public List<UsersInRoom> getUsersInRoomList() {
        return usersInRoomList;
    }

    public void setUsersInRoomList(List<UsersInRoom> usersInRoomList) {
        this.usersInRoomList = usersInRoomList;
    }
}
