package com.engeto.hotel;

import java.util.ArrayList;
import java.util.List;

public class ListOfRooms {
    List<Room> roomList = new ArrayList<>();
    public void addRoom (Room newRoom) {
        roomList.add(newRoom);}
    public void removeRoom (Room roomToRemove) {
        roomList.remove(roomToRemove);}
    public int numberOfRooms () {return roomList.size();}
    public void printAllRooms () {
        for (Room room : roomList) {
            System.out.println(""+room.getName()+" "+room.getRoomNumber1()+", "+room.getRoomType()+", "+room.getRoomView()+", "+room.getPriceOfOneNight()+" Kč/noc");
        }
    }
}
