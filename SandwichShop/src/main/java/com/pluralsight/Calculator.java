package com.pluralsight;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.print("Please enter if you want loaded sandwich (Enter yes, Enter no):");
        input.nextLine();
        String loadedResponse = input.nextLine().trim().toLowerCase();
        boolean isLoaded = loaded.equals("yes");
        if (if isLoaded) {
            basePrice 
        }
        Scanner waiter = new Scanner(System.in);
        float regularSize = 5.45f;
        float largeSize = 8.95f;
        System.out.print("choose sandwich size (Enter 1 for regular, 2 for larger): ");
        int option = waiter.nextInt();
        System.out.print("Please enter your age for a discount: ");
        int age = waiter.nextInt();
        float base = 0f;
        if (option == 1) {
            base = 5.45f;

        }else if (option == 2) {
            base = 8.95f;
        } else {
            System.out.println("Please choose a correct option, 1 or 2; Please restart the app;");
        }
        double discount = 0.0;
        if (age <= 17) {
            discount = 0.10;
        } else if (age >= 65) {
            discount = 0.20;
        }
        System.out.printf("Your total is : $%.2f", base * (1-discount));

    }
}