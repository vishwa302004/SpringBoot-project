package com.example.trip.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name  = "Trips")
public class Trip {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int Trip_id ;
    @Column(name = "Trip_Name")
    String name;
    @Column(name = "No_Of_Person")
    int persons;
    @Column(name = "No_Of_days")
    int days;
    @Column(name ="Package_price")
    int price;
    public int getTrip_id() {
        return Trip_id;
    }
    public void setTrip_id(int trip_id) {
        Trip_id = trip_id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPersons() {
        return persons;
    }
    public void setPersons(int persons) {
        this.persons = persons;
    }
    public int getDays() {
        return days;
    }
    public void setDays(int days) {
        this.days = days;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public Trip(int trip_id, String name, int persons, int days, int price) {
        Trip_id = trip_id;
        this.name = name;
        this.persons = persons;
        this.days = days;
        this.price = price;
    }
    public Trip() {
    }

}