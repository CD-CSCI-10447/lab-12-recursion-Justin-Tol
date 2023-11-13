package edu.desu.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HomeworkTest {

    @Test
    public void count7Test01(){
        int expected = 2;
        int actual = Homework.count7(717);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void count7Test02(){
        int expected = 1;
        int actual = Homework.count7(7);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void count7Test03(){
        int expected = 0;
        int actual = Homework.count7(123);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void count8Test01(){
        int expected = 1;
        int actual = Homework.count8(8);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void count8Test02(){
        int expected = 2;
        int actual = Homework.count8(818);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void count8Test03(){
        int expected = 4;
        int actual = Homework.count8(8818);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void powerNTest01(){
        int expected= 3;
        int actual = Homework.powerN(3, 1);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void powerNTest02(){
        int expected= 9;
        int actual = Homework.powerN(3, 2);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void powerNTest03(){
        int expected= 27;
        int actual = Homework.powerN(3, 3);
        Assertions.assertEquals(expected, actual);
    }
}
