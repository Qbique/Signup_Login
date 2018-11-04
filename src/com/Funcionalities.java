package com;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Funcionalities {

    List<User> signedUpUsers = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void signUp() {
        System.out.println("Please insert username");
        String usernameInput = scanner.next();

        System.out.println("Please insert password");
        String passwordInput = scanner.next();

        User userInput = new User(usernameInput, passwordInput);

        if (signedUpUsers.contains(userInput)){
            System.out.println("This user is already signed up");
        } else {
            signedUpUsers.add(userInput);
        }
    }

    public void logIn() {
        System.out.println("Please insert username");
        String usernameInput = scanner.next();

        System.out.println("Please insert password");
        String passwordInput = scanner.next();

        User userInput = new User(usernameInput, passwordInput);

        if(signedUpUsers.isEmpty()) {
            System.out.println("No entries exists,please sign up first");
        }
        if(signedUpUsers.contains(userInput)){
            System.out.println("Welcome "+usernameInput);
                    } else {
            System.out.println("Wrong username or password");
        }


    }

}
// Difference between this
/*and this*/

