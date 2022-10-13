package pio;

import java.util.Random;

public class Player {
    
    private Random rand = new Random();
    private String name;
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    int guess() {
        return rand.nextInt(6) + 1;
    } 
    
}
