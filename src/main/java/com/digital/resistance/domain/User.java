package com.digital.resistance.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private long user_id;

    @Column(name = "hashtag")
    private String hashtag;

    @Column(name = "phone")
    private String phone;

//    @ElementCollection
//    @Embedded
//    @JoinTable(name = "room",
//            joinColumns = @JoinColumn(name = "room_id"))
    @Column(name ="username")
    private String username;

    public User() {
    }

    public User(String hashtag, String phone) {
        this.hashtag = hashtag;
        this.phone = phone;
    }

    public User(String hashtag, String phone, String username) {
        this.hashtag = hashtag;
        this.phone = phone;
        this.username = username;
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


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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
