package lerngruppe;

import java.util.Scanner;

public class Lernen {

    public static void main(String[] args) {
        queerSummenBerechnung();
    }

    /**
     * Berechnung der Queersumme
     */
    public static void queerSummenBerechnung() {
        Scanner scIn = new Scanner(System.in);
        int zahl, eingabe, qSum;

        qSum = 0;
        zahl = scIn.nextInt();
        eingabe = zahl;
        scIn.close();

        while(zahl > 0) {
            qSum += (zahl % 10);
            zahl = (zahl / 10);
        }
        System.out.println("Q("+eingabe+") = " + qSum);

    }

    /**
     * Problemstellung:
     * Struktogramm in eine Java Lösung implementieren - Aufgabe 21, Iteration - Berechnung der nächsten Primzahl
     * Struktogramm import:
     *  - java.util.Scanner
     *  - java.lang.Math
     *  
     * Struktogramm Aufgaben:
     * 1. Methodenerstellung
     * - Variablen: Zahl, Teiler-ganze-zahlen, Primzahl-Wahrheitswert
     * 2. Lesen sie eine Zahl ein
     * - Zahl wird mittels Scanner eingelesen & in int zahl, übergeben.
     * 2.1 Addiere 1 zur Zahl
     * 2.2 Setze Teiler auf 2
     * 2.3 Setze Primzahl auf Wahr
     * 2.4.1 Dividiere Zahl durch Teiler
     * - IF(
     *  Wenn Division aufgeht:
     *  -   Setze Primzahl auf falsch
     *  Wenn Division nicht aufgeht:
     *  -   mache nichts
     * )
     * Wiederhole solange bis Primzahl Falsch oder Teiler > Quadratwurzel von der Zahl
     * 2-end: bis Primzahl wahr
     * 3. Gebe Zahl aus.*/
    public static void primZahlBerechnung(){
        int zahl;
        int teiler;
        boolean isPrime;

        Scanner scIn = new Scanner(System.in);
        zahl = scIn.nextInt();
        scIn.close();
        
        do { 
            zahl += 1;
            teiler = 2;
            isPrime = true;
            do {
                if (0 == (zahl % teiler)) {isPrime = false;}
                teiler += 1;
            } while (
                    !((!isPrime) || (teiler > Math.sqrt(zahl)))         // negierter ausdruck
                );
        } while (!isPrime); 

        System.out.println(zahl);
    }

}