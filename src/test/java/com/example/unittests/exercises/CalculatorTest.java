package com.example.unittests.exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

class CalculatorTest {

    @Test
    void sumMethodAAA() {
        //Arrange
        Calculator calculator = new Calculator();
        int number1 = 5;
        int number2 = 3;

        //Act
        int res = calculator.sumMethod(number1, number2);

        //Assert
        assertEquals(8, res);
    }

    @Test
    void subtractMethodAAA() {
        //Arrange
        Calculator calculator = new Calculator();
        int number1 = 12;
        int number2 = 6;

        //Act
        int res = calculator.subtractMethod(number1, number2);

        //Assert
        assertEquals(6, res);
    }

    @Test
    void multiplyMethodAAA() {
        //Arrange
        Calculator calculator = new Calculator();
        int number1 = 5;
        int number2 = 7;

        //Act
        int res = calculator.multiplyMethod(number1, number2);

        //Assert
        assertEquals(35, res);
    }

    @Test
    void divideMethodAAA() {
        //Arrange
        Calculator calculator = new Calculator();
        int number1 = 15;
        int number2 = 3;

        //Act
        int res = calculator.divideMethod(number1, number2);

        //Assert
        assertEquals(5, res);
    }


    @Test
    void sumMethod() {
        assertThat(new Calculator().sumMethod(10, 5)).isEqualTo(15);
    }

    @Test
    void subtractMethod() {
        assertThat(new Calculator().subtractMethod(10, 7)).isEqualTo(3);
    }

    @Test
    void multiplyMethod() {
        assertThat(new Calculator().multiplyMethod(5, 7)).isEqualTo(35);
    }

    @Test
    void divideMethod() {
        assertThat(new Calculator().divideMethod(15, 3)).isEqualTo(5);
    }
}