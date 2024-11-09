package org.example;

public class Dev {

    private Laptop laptop;

    public void setLaptop(final Laptop laptop) {
        this.laptop = laptop;
    }

    public void compile() {
        this.laptop.compile();
    }
 }
