package com.engeto.hotel;

import java.util.ArrayList;
import java.util.List;

public class ListOfBookings {

    List <Booking> booking0 = new ArrayList<>();
    public void addBooking0 (Booking newBooking) {
        booking0.add(newBooking);}
    public void removeBooking0 (Booking bookingToRemove) {
        booking0.remove(bookingToRemove);}
    public int numberOfBooking0 () {return booking0.size();}


    public void printBooking0 () {
        for (Booking booking : booking0) {
            System.out.println(""+booking.getTypeOfVacation()+"");
        }
    }

    List <Booking> booking1 = new ArrayList<>();
    public void addBooking1 (Booking newBooking) {
        booking0.add(newBooking);}
    public void removeBooking1 (Booking bookingToRemove) {
        booking0.remove(bookingToRemove);}
    public int numberOfBooking1 () {return booking0.size();}


    public void printBooking1 () {
        for (Booking booking : booking0) {
            System.out.println(""+booking.getTypeOfVacation()+" od "+booking.dateFrom.getDayOfMonth()+"."+booking.dateFrom.getMonthValue()+"."+booking.dateFrom.getYear()+" do "+booking.dateTo.getDayOfMonth()+"."+booking.dateTo.getMonthValue()+"."+booking.getDateTo().getYear()+"");
        }
    }

    List <Booking> booking2 = new ArrayList<>();
    public void addBooking2 (Booking newBooking) {
        booking2.add(newBooking);}
    public void removeBooking2 (Booking bookingToRemove) {
        booking2.remove(bookingToRemove);}
    public int numberOfBooking2 () {return booking2.size();}

    public void printBooking2 () {
        for (Booking booking : booking2) {
            System.out.println(""+booking.getTypeOfVacation()+" od "+booking.dateFrom.getDayOfMonth()+"."+booking.dateFrom.getMonthValue()+"."+booking.dateFrom.getYear()+" do "+booking.dateTo.getDayOfMonth()+"."+booking.dateTo.getMonthValue()+"."+booking.getDateTo().getYear()+"");
        }
    }

    List <Booking> booking3 = new ArrayList<>();
    public void addBooking3 (Booking newBooking) {
        booking3.add(newBooking);}
    public void removeBooking3 (Booking bookingToRemove) {
        booking3.remove(bookingToRemove);}
    public int numberOfBooking3 () {return booking3.size();}

    public void printBooking3 () {
        for (Booking booking : booking3) {
            System.out.println(""+booking.getTypeOfVacation()+" od "+booking.dateFrom.getDayOfMonth()+"."+booking.dateFrom.getMonthValue()+"."+booking.dateFrom.getYear()+" do "+booking.dateTo.getDayOfMonth()+"."+booking.dateTo.getMonthValue()+"."+booking.getDateTo().getYear()+"");
        }
    }





}
