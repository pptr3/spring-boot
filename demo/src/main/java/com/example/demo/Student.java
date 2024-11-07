package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Student {

    //@Autowired
    //@Qualifier("desktop")
    private Computer pc;

    @Autowired
    @Qualifier("desktop")
    public void setComputer(Computer pc) {
        this.pc = pc;
    }

    public void sayHi() {
        this.pc.compile();
        System.out.println("I am a student");
    }
}
