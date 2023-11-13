package edu.desu.iterativeVSrecursive;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FactorialTest {

    @Test
    public void iterativeTest01(){
        int expected = 120;
        int actual = Factorial.factorialIterative(5);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void iterativeTest02(){
        int expected = 24;
        int actual = Factorial.factorialIterative(4);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void recursiveTest01(){
        int expected = 120;
        int actual = Factorial.factorialRecursive(5);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void recursiveTest02(){
        int expected = 24;
        int actual = Factorial.factorialRecursive(4);
        Assertions.assertEquals(expected, actual);
    }
}
