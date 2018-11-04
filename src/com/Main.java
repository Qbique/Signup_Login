package com;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        initialPrinting();

        Funcionalities funcionalities = new Funcionalities();
        int menuOptionUserInserted = scanner.nextInt();

        while (menuOptionUserInserted != 3) {

            if (menuOptionUserInserted < 1 || menuOptionUserInserted > 3) {

                System.out.println("Please insert valid number");
                menuOptionUserInserted = scanner.nextInt();

            } else {

                if (menuOptionUserInserted == 1) {
                    funcionalities.signUp();
                }

                if (menuOptionUserInserted == 2) {
                    funcionalities.logIn();
                }

                initialPrinting();
                menuOptionUserInserted = scanner.nextInt();


            }
        }

        System.out.println("Exiting program");

    }

    private static void initialPrinting() {
        System.out.println("Welcome, your options are:");
        System.out.println("1: Sign up");
        System.out.println("2: Log in");
        System.out.println("3: Exit");
    }
}
