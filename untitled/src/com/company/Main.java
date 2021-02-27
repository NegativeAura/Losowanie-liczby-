package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;


        Scanner scanner = new Scanner(System.in);

        boolean wasNumberGuessed = false;

        while (!wasNumberGuessed) {

            System.out.println("Podaj Liczbe");

            int userNumber = scanner.nextInt();


            if (userNumber < numberToGuess) {
                System.out.println("liczba jest za mala");
            }else if (userNumber>numberToGuess) {

                System.out.println("Liczba jest za duza");
            }else {
                System.out.println("Brawo to wlasciwa liczba");
                wasNumberGuessed=true;
            }

        }


    }
}
