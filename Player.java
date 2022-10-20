package pio;

import java.util.Random;

public class Player {
    
    private Random rand;
    private String name = "Brak imienia";
    
    public Player() {
        this.rand = new Random();
    }
    
    public Player(String name) {
        this.rand = new Random();
        setName(name);
    }
    
    public void setName(String name) {
        if(name != null && !name.isEmpty())
            this.name = name;
        else
            System.err.println("Błędne imię");
    }
    
    public String getName() {
        return name;
    }
    
    int guess() {
        return rand.nextInt(6) + 1;
    } 
    
}
