package com.firstproject.springboot.demo.firstApp.module.di;

import com.firstproject.springboot.demo.firstApp.module.Interface.Coach;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
public class CricketCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 min:)";
    }
}
