package testat;

import java.util.Scanner;

public class GeschwindigkeitAuto {

    public static void einlesenGeschwindigkeit(int geschwindigkeiten[]) {
        Scanner scInput = new Scanner(System.in);
        int cleanInputInt;
        int index = 0;
        String rwInputString;

        do { 
            rwInputString = scInput.nextLine();

            if (!rwInputString.isEmpty() && rwInputString.matches("\\d*")) {
                cleanInputInt = Integer.parseInt(rwInputString);
                if ((cleanInputInt < 301) && (cleanInputInt > 0)) {
                    geschwindigkeiten[index] = cleanInputInt;
                    index = index + 1;
                }
            }

        } while (!"-1".equals(rwInputString) && (index < geschwindigkeiten.length));
    }

    public static void ausgeben(int geschwindigkeiten[]){
        for (int i = 0; geschwindigkeiten[i] != 0; i++) {
            System.out.println("Geschwindigkeit: " + geschwindigkeiten[i] + " km/h");
        }
    }

}