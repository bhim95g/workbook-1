package com.pluralsight;
import java.util.Scanner;
public class BasicCalculator {
    public static void main(String[] args) {Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number");
        double total = input.nextDouble();
        System.out.println("Enter the second number");
        double add = input.nextDouble();
        double sum = total + add;
        System.out.println("The sum is " + sum);

    }
}
