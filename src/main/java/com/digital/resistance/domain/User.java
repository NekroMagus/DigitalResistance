package com.digital.resistance.domain;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private long user_id;

    @Column(name = "hashtag")
    private String hashtag;

    @Column(name = "phone")
    private String phone;

    @ElementCollection
//    @JoinTable(name = "room",
//            joinColumns = @JoinColumn(name = "room_id"))
            List<UsersInRoom> usersInRoomList;

    public User() {
    }

    public User(String hashtag, String phone) {
        this.hashtag = hashtag;
        this.phone = phone;
    }

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    public String getHashtag() {
        return hashtag;
    }

    public void setHashtag(String hashtag) {
        this.hashtag = hashtag;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<UsersInRoom> getUsersInRoomList() {
        return usersInRoomList;
    }

    public void setUsersInRoomList(List<UsersInRoom> usersInRoomList) {
        this.usersInRoomList = usersInRoomList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return user_id == user.user_id &&
                Objects.equals(hashtag, user.hashtag) &&
                Objects.equals(phone, user.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user_id, hashtag, phone);
    }
}
