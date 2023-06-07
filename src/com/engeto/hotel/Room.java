package com.engeto.hotel;

import java.math.BigDecimal;

public class Room {
    String name;
    int roomNumber1;
    String roomType;
    String roomView;
    BigDecimal priceOfOneNight;
    Boolean balcony;

    public Room(String name, int roomNumber1, String roomType, String roomView, BigDecimal priceOfOneNight, Boolean balcony) {
        this.name = name;
        this.roomNumber1 = roomNumber1;
        this.roomType = roomType;
        this.roomView = roomView;
        this.priceOfOneNight = priceOfOneNight;
        this.balcony = balcony;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoomNumber1() {
        return roomNumber1;
    }

    public void setRoomNumber1(int roomNumber1) {
        this.roomNumber1 = roomNumber1;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public String getRoomView() {
        return roomView;
    }

    public void setRoomView(String roomView) {
        this.roomView = roomView;
    }

    public BigDecimal getPriceOfOneNight() {
        return priceOfOneNight;
    }

    public void setPriceOfOneNight(BigDecimal priceOfOneNight) {
        this.priceOfOneNight = priceOfOneNight;
    }

    public Boolean getBalcony() {
        return balcony;
    }

    public void setBalcony(Boolean balcony) {
        this.balcony = balcony;
    }
}

