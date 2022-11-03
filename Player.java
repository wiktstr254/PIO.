package com.mycompany.pio;

public abstract class Player {
    
    private String name = "Brak imienia";
    
    public Player() {
        
    }
    
    public Player(String name) {
        setName(name);
    }
    
    final public void setName(String name) {
        final String regex = "^[\\-\\_\\.\\w]{3,}$";
        
        if(name.matches(regex)) 
            this.name = name;
        else
            throw new IllegalArgumentException("Błędne imię");
    }
    
    final public String getName() {
        return name;
    }
    
    abstract public int guess();
    
}
