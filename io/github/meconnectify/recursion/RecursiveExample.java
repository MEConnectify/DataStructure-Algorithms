package io.github.meconnectify.recursion;

import java.util.Scanner;

public class RecursiveExample {
    /*
    For this example we will be finding a Recursive method to find the factorial of a number
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            System.out.println("You have entered an invalid integer.");
            return;
        }
        int x = scanner.nextInt(); //Instead of calling the scanner two times, store the value.
        RecursiveExample obj = new RecursiveExample();
        System.out.println("The factorial of " + x + " is: " + obj.factorial(x));
    }

    int factorial(int n) {
        if (n == 1 || n == 0) return 1; //You must have code that stops the method when it reaches a certain level

        return n * factorial(n - 1); //Calling the same method within itself.
    }
}
