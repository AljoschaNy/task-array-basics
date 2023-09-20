package org.example;

public class Main {
    public static void main(String[] args) {
        // Schritt 1: Erstelle ein Array mit den Zahlen von 1 bis 10 und gib es auf der Konsole aus.
        int[] numbersArray1 = {1,2,3,4,99,6,7,8,9,10};

        for(int number: numbersArray1) {
            System.out.println(number);
        }

        // Schritt 2: Berechne die Summe aller Zahlen im Array und gib das Ergebnis auf der Konsole aus.
        int sum = 0;
        for(int number: numbersArray1) {
            sum += number;
        }
        System.out.println("Summe: " + sum);

        // Schritt 3: Finde die größte Zahl im Array und gib sie auf der Konsole aus.
        int biggestNumber = numbersArray1[0];

        for(int number: numbersArray1) {
            if(number > biggestNumber) {
                biggestNumber = number;
            }
        }

        System.out.println("The biggest number is: " + biggestNumber);

        // Schritt 4: Erstelle ein zweites Array mit den Zahlen von 11 bis 20.
        // Schritt 5: Führe eine elementweise Addition beider Arrays durch und speichere das Ergebnis in einem dritten Array. Gib das Ergebnis-Array auf der Konsole aus.


    }
}