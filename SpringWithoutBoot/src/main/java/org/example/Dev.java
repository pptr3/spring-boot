package org.example;


public class Dev {

    private Computer com;


    public void compile() {
        this.com.compile();
    }

    public void setCom(Computer com) {
        this.com = com;
    }
}
