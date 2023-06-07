package com.engeto.hotel;

import java.util.ArrayList;
import java.util.List;

public class ListofGuests {
    List <Guests> guestList = new ArrayList<>();

    public void addGuest (Guests newGuest) { guestList.add(newGuest); }
    public void removeGuest (Guests guestToRemove) { guestList.remove(guestToRemove);}
    public int numberOfGuests () {return guestList.size();}

    public void printAllGuests () {
        for (Guests guests : guestList) {
            System.out.println(""+ guests.getName()+" "+guests.getSurname()+" ("+guests.bornDate.getDayOfMonth()+"."+guests.bornDate.getMonthValue()+"."+guests.getBornDate().getYear()+")");
        }
    }
}
