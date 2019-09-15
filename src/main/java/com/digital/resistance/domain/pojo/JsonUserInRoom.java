package com.digital.resistance.domain.pojo;

public class JsonUserInRoom {
    private long userId;
    private String userPhone;
    private String userHash;
    private String username;
    private int userPrice;
    private int fullPrice;
    private int countUsers;
    private long roomdId;
    private String roomName;
    private boolean equivalently;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserHash() {
        return userHash;
    }

    public void setUserHash(String userHash) {
        this.userHash = userHash;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getUserPrice() {
        return userPrice;
    }

    public void setUserPrice(int userPrice) {
        this.userPrice = userPrice;
    }

    public int getFullPrice() {
        return fullPrice;
    }

    public void setFullPrice(int fullPrice) {
        this.fullPrice = fullPrice;
    }

    public int getCountUsers() {
        return countUsers;
    }

    public void setCountUsers(int countUsers) {
        this.countUsers = countUsers;
    }

    public long getRoomdId() {
        return roomdId;
    }

    public void setRoomdId(long roomdId) {
        this.roomdId = roomdId;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public boolean isEquivalently() {
        return equivalently;
    }

    public void setEquivalently(boolean equivalently) {
        this.equivalently = equivalently;
    }
}
