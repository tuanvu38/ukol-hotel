package com.engeto.hotel;

import java.time.LocalDate;

public class Booking {
    String bookingName;
    String bookingSurname;
    LocalDate bookingBirthDate;
    String typeOfVacation;
    LocalDate dateFrom;
    LocalDate dateTo;

    public Booking(String bookingName, String bookingSurname, LocalDate bookingBirthDate, String typeOfVacation, LocalDate dateFrom, LocalDate dateTo) {
        this.bookingName = bookingName;
        this.bookingSurname = bookingSurname;
        this.bookingBirthDate = bookingBirthDate;
        this.typeOfVacation = typeOfVacation;
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
    }

    public Booking(String typeOfVacation, LocalDate dateFrom, LocalDate dateTo) {
        this.typeOfVacation = typeOfVacation;
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
    }

    public Booking(String typeOfVacation) {
        this.typeOfVacation = typeOfVacation;
    }

    public String getBookingName() {
        return bookingName;
    }

    public void setBookingName(String bookingName) {
        this.bookingName = bookingName;
    }

    public String getBookingSurname() {
        return bookingSurname;
    }

    public void setBookingSurname(String bookingSurname) {
        this.bookingSurname = bookingSurname;
    }

    public LocalDate getBookingBirthDate() {
        return bookingBirthDate;
    }

    public void setBookingBirthDate(LocalDate bookingBirthDate) {
        this.bookingBirthDate = bookingBirthDate;
    }

    public String getTypeOfVacation() {
        return typeOfVacation;
    }

    public void setTypeOfVacation(String typeOfVacation) {
        this.typeOfVacation = typeOfVacation;
    }

    public LocalDate getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(LocalDate dateFrom) {
        this.dateFrom = dateFrom;
    }

    public LocalDate getDateTo() {
        return dateTo;
    }

    public void setDateTo(LocalDate dateTo) {
        this.dateTo = dateTo;
    }
}



