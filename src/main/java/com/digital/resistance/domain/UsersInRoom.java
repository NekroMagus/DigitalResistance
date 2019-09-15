package com.digital.resistance.domain;

import javax.persistence.*;

@Entity
@Table(name = "users_in_room")
public class UsersInRoom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="user_id")
    private long userus;

    @Column(name = "room_id")
    private long roomus;

    @Column(name = "price")
    private int price;

    @Column(name = "isadmin")
    private boolean isAdmin;

    public UsersInRoom() {
    }

    public UsersInRoom(long userus, long roomus, int price, boolean isAdmin) {
        this.userus = userus;
        this.roomus = roomus;
        this.price = price;
        this.isAdmin = isAdmin;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUserus() {
        return userus;
    }

    public void setUserus(long userus) {
        this.userus = userus;
    }

    public long getRoomus() {
        return roomus;
    }

    public void setRoomus(long roomus) {
        this.roomus = roomus;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

}
