import com.engeto.hotel.*;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Hosté:");
        ListofGuests list = new ListofGuests();
        Guests guest1 = new Guests("Adéla", "Malíková", LocalDate.of(1993, 3, 13) );
        Guests guest2 = new Guests("Jan", "Dvořáček", LocalDate.of(1995, 5, 5));
        list.addGuest(guest1);list.addGuest(guest2);
        list.printAllGuests();
        System.out.println();
        System.out.println("Dostupné pokoje:");

        ListOfRooms roomList = new ListOfRooms();
        Room room1 = new Room("Pokoj", 1, "jednolůžkový s balkónem", "výhled na moře", BigDecimal.valueOf(1000), true);
        Room room2 = new Room("Pokoj", 2, "jednolůžkový s balkónem", "výhled na moře", BigDecimal.valueOf(1000), true);
        Room room3 = new Room("Pokoj", 3, "trojlůžkový bez balkónu", "výhled na moře", BigDecimal.valueOf(2400), false);
        roomList.addRoom(room1);roomList.addRoom(room2);roomList.addRoom(room3);
        roomList.printAllRooms();


        System.out.println();
        System.out.println("Seznam rezervací");

        System.out.println();
        //Pokoj 1
        System.out.println(""+room1.getName()+" "+room1.getRoomNumber1()+", "+room1.getRoomType()+", "+room1.getRoomView()+", "+room1.getPriceOfOneNight()+" Kč/noc: ");
        ListOfBookings bookingList1 = new ListOfBookings();
        Booking booking1 = new Booking("Adéla", "Malíková", LocalDate.of(1993, 3, 13),"pracovní pobyt", LocalDate.of(2021, 7, 19), LocalDate.of(2021, 7, 26));
        list.removeGuest(guest2);
        list.printAllGuests();

        bookingList1.addBooking1(booking1);
        bookingList1.printBooking1();

        System.out.println();
        //Pokoj 2
        System.out.println(""+room2.getName()+" "+room2.getRoomNumber1()+", "+room2.getRoomType()+", "+room2.getRoomView()+", "+room2.getPriceOfOneNight()+" Kč/noc: ");
        ListOfBookings freeBooking = new ListOfBookings();
        Booking booking0 = new Booking("volná rezervace");
        freeBooking.addBooking0(booking0);
        freeBooking.printBooking0();

        System.out.println();
        //Pokoj 3
        System.out.println(""+room3.getName()+" "+room3.getRoomNumber1()+", "+room3.getRoomType()+", "+room3.getPriceOfOneNight()+" Kč/noc: ");
        ListOfBookings bookingList2 = new ListOfBookings();
        Booking booking2 = new Booking("Adéla", "Malíková", LocalDate.of(1993, 3, 13),"rekreační pobyt", LocalDate.of(2021, 9, 1), LocalDate.of(2021, 9, 14));
        Booking booking3 = new Booking("Jan", "Dvořáček", LocalDate.of(1995, 5, 5),"rekreační pobyt", LocalDate.of(2021, 9, 1), LocalDate.of(2021, 9, 14));
        list.printAllGuests();
        bookingList2.addBooking2(booking2);
        bookingList2.printBooking2();
        System.out.println();
        list.removeGuest(guest1);
        list.addGuest(guest2);
        list.printAllGuests();
        bookingList2.addBooking2(booking3);
        bookingList2.removeBooking2(booking2);
        bookingList2.printBooking2();































    }
}