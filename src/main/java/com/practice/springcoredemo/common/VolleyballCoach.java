package com.practice.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class VolleyballCoach implements Coach {

    public VolleyballCoach() {
        System.out.println("Volleyball Coach: inside default constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice Spiking for 30 minutes";
    }
}
