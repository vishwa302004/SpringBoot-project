package com.example.trip.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.trip.model.Trip;

public interface TripRepo extends JpaRepository<Trip,Integer>{

    
}