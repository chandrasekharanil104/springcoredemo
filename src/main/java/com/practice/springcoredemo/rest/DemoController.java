package com.practice.springcoredemo.rest;

import com.practice.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach myCoach;

    private Coach anotherCoach;


    // using constructor for dependency injection
    @Autowired
    public DemoController(@Qualifier("cricketCoach") Coach theCoach, @Qualifier("cricketCoach") Coach  theAnotherCoach ) {
        myCoach = theCoach;
        anotherCoach =  theAnotherCoach;
        System.out.println("Controller: inside default constructor: " + getClass().getSimpleName());
    }

//    // using setter for dependency injection
//    @Autowired
//    public void setCoach(Coach theCoach){
//        myCoach = theCoach;
//    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }

    @GetMapping("/check")
    public String check(){
        return "Comparing beans myCoach == anotherCOach " + (myCoach == anotherCoach);
    }
}
