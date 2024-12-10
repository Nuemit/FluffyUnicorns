package testat;

import java.util.Scanner;

/**
 * A class to handle speed measurements for a car.
 * This class provides functionality to input and display speed values.
 * Speed values are limited between 1 and 300 km/h.
 * 
 * @author [Nuemit]
 * @version 1.0
 */
public class GeschwindigkeitAuto {

    /**
     * Reads speed values from user input and stores them in an array.
     * The input process continues until either:
     * - The user enters "-1" to terminate input
     * - The array is full
     * Only valid speeds between 1 and 300 km/h are stored.
     * Non-numeric inputs and empty lines are ignored.
     *
     * @param geschwindigkeiten Array to store the speed values
     */
    public static void einlesenGeschwindigkeit(int geschwindigkeiten[]) {
        Scanner scInput = new Scanner(System.in);
        int index = 0;
        int cleanInputInt;
        String rwInputString;

        do {
            rwInputString = "";
            cleanInputInt = 0;
            rwInputString = scInput.next();
            if(!rwInputString.isEmpty() && rwInputString.matches("\\d*")){
                cleanInputInt = Integer.parseInt(rwInputString);
                if((cleanInputInt < 301) && (cleanInputInt > 0)){
                    geschwindigkeiten[index] = cleanInputInt;
                    index = index + 1;
                }
            }
        } while (!"-1".equals(rwInputString) && (index < geschwindigkeiten.length) );
        if (geschwindigkeiten[0] == 0) {
            geschwindigkeiten[0] = 1;
        }
    }

    /**
     * Outputs the stored speed values to the console.
     * Each speed value is printed in the format "Geschwindigkeit: X km/h".
     * The output process continues until a speed value of 0 is encountered.
     *
     * @param geschwindigkeiten Array containing the speed values to be printed
     */
    public static void ausgeben (int geschwindigkeiten[]){
        if (geschwindigkeiten == null || geschwindigkeiten.length == 0){
            System.out.println("null");
        } else if (!(geschwindigkeiten.length == 0) && geschwindigkeiten != null) {
            for (int i = 0; (i < geschwindigkeiten.length); i++){
                if(!(geschwindigkeiten[i] == 0)) {
                    System.out.println("Geschwindigkeit: "+geschwindigkeiten[i]+" km/h");
                } 
            }   
        }
    }
}