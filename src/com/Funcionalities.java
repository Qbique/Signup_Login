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

}
