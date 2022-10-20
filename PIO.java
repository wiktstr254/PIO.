package pio;

import java.util.Random;

public class Pio {
    
     public static void main(String[] args) {

     Random dice = new Random();     //obiekt losujący
        int number;                  //wylosowana liczba
        int guess;                   //propozycja (strzał) gracza

        do {
            System.out.println("---------------------");
            
            Player player = new Player();

            number = dice.nextInt(6) + 1;
            System.out.println("Kostka: " + number);

            guess = player.guess();

            if (number != guess) {
                System.out.println("PUDŁO!");
            }
            else {
                System.out.println("BRAWO!");
            }

        } while (number != guess);
    }
  
}
