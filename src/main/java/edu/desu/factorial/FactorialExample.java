package edu.desu.factorial;

public class FactorialExample {
    // Recursive function
    public static int factorial(int n) {
        // Base case
        if (n == 1) {
            return 1;
        }
        // Recursive case
        else {
            return (n * factorial(n-1));
        }
    }
}
