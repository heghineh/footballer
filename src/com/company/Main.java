package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        Footballer[] footballers = new Footballer[10];
        System.out.println("Enter footballers' names:");

        for (int i = 0; i < footballers.length; i++) {
            System.out.print("[" + (i + 1) + "] --> ");
            String name = scanner.nextLine();
            Footballer footballer = new Footballer(name, random.nextInt(100));
            footballers[i] = footballer;
        }

        for (int i = 0; i < footballers.length; i++) {
            for (int j = 0; j < footballers.length - i - 1; j++) {
                if (footballers[j].getRating() < footballers[j + 1].getRating()) {
                    Footballer temp = footballers[j];
                    footballers[j] = footballers[j + 1];
                    footballers[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < footballers.length; i++) {
            System.out.println("Name: " + footballers[i].getName() + "  Rating:  " + footballers[i].getRating());
        }

        System.out.println();

        for (int i = 0; i < 3; i++) {
            System.out.println("Name: " + footballers[i].getName() + "  Rating:  " + footballers[i].getRating());
        }
    }
}