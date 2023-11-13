package edu.desu.factorial;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FactorialExampleTest {

    @Test
    public void factorialTest01(){
        int expected = 120;
        int actual = FactorialExample.factorial(5);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void factorialTest02(){
        int expected = 24;
        int actual = FactorialExample.factorial(4);
        Assertions.assertEquals(expected, actual);
    }
}
