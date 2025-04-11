package com.pluralsight;

import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MathApp {
    public static void main(String[] args) {
        int bobSalary = 10000;
        int garySalary = 20000;
        double highestSalary = Math.max(bobSalary, garySalary);
        System.out.println("The highest salary is $" + highestSalary);
    }
}
class VariableName {
    public static void main(String[] args) {
        double carPrice = 15500.85;
        double truckPrice = 18000.95;
        double smallest = Math.min(carPrice, truckPrice);
        System.out.println("carPrice: $" + carPrice);
        System.out.println("truckPrice: $" + truckPrice);
        System.out.println("Smallest price: $" + smallest);
    }
}

class main {
    public static void main(String[] args) {
        double radius = 7.25;
        double area = Math.PI * radius * radius;
        System.out.println("Radius: " + radius);
        System.out.println("Area of the Circle: " + area);
    }
}


