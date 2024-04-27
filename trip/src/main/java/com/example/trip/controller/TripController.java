package com.example.trip.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.trip.model.Trip;
import com.example.trip.repository.TripRepo;
@RestController
public class TripController {
    @Autowired
    TripRepo repo;
    @GetMapping("/tripplan")
    public List<Trip> getAllTrip()
    {
        List<Trip> trip =repo.findAll();
        return trip;
    }
    @GetMapping("/tripplan/{id}")
    public Trip getTrip(@PathVariable int id)
    {
        Trip trip = repo.findById(id).get();
        return trip;
    }
    @PostMapping("/tripplan/add")
    public void createTrip(@RequestBody Trip trip)
    {
        repo.save(trip);
    }
    @PutMapping("/tripplan/update/{id}")
    public void updateStudent(@PathVariable int id)
    {
        Trip trip = repo.findById(id).get();
        repo.save(trip);
    }
    @DeleteMapping("/tripplan/delete/{id}")
    public void deleteTrip(@PathVariable int id)
    {
        Trip trip = repo.findById(id).get();
        repo.delete(trip);
    }
}