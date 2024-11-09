package org.example;

public class Dev {

    private final Laptop laptop;


    public Dev(Laptop laptop) {
        this.laptop = laptop;
    }


    public void compile() {
        this.laptop.compile();
    }
 }
