package edu.desu.iterativeVSrecursive;

public class Factorial {

    public static int factorialIterative(int n) {
        int factorialResult = 1;
        for (int i = 1; i <= n; i++) {
            factorialResult = factorialResult * i;
        }
        return factorialResult;
    }

    // Todo : Complete Function
    public static int factorialRecursive(int n) {
        return 0;
    }
}
