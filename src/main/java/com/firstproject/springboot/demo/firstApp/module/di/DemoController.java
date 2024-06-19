package com.firstproject.springboot.demo.firstApp.module.di;

import com.firstproject.springboot.demo.firstApp.module.Interface.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    //define a private field for dependency
    private Coach myCoach;


    //Example of Constructor Injection
//    @Autowired
//    public DemoController(Coach theCoach){
//        myCoach = theCoach;
//    }

    //Example of Setter injection
    @Autowired
    public void setCoach(Coach theCoach){
        myCoach = theCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }

}
