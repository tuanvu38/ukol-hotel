package com.engeto.hotel;

import java.time.LocalDate;

public class Guests {
    String name;
    String surname;
    LocalDate bornDate;

    public Guests(String name, String surname, LocalDate bornDate) {
        this.name = name;
        this.surname = surname;
        this.bornDate = bornDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getBornDate() {
        return bornDate;
    }

    public void setBornDate(LocalDate bornDate) {
        this.bornDate = bornDate;
    }
}
