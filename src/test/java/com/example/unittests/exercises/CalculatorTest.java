package com.example.unittests.exercises;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.stubbing.Answer;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;
@RunWith(MockitoJUnitRunner.class)
class CalculatorTest {

    @Test
    void convertIntToDoubleTest() {
      Calculator calculator = new Calculator();

      double res = calculator.convertIntToDouble(10);

        assertEquals(10.0, res);
        System.out.println(res);
    }



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
    void sumMethodAAAMock() {
        //Arrange
        Calculator calculatorMock = Mockito.mock(Calculator.class);

        int number1 = 5;
        int number2 = 3;

        Mockito.when(calculatorMock.sumMethod(number1, number2)).thenReturn(8);

        //Act
        int res = calculatorMock.sumMethod(number1, number2);

        //Assert
        assertEquals(8, res);
    }

    @Test
    void sumMethod_ZeroInputs(){
        //Arrange
        Calculator calculator = new Calculator();
        int number1 = 0;
        int number2 = 0;

        //Act
        int res = calculator.sumMethod(number1, number2);

        //Assert
        assertEquals(0, res);
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
    void subtractMethod_ZeroInputs() {
        //Arrange
        Calculator calculator = new Calculator();
        int number1 = 0;
        int number2 = 0;

        //Act
        int res = calculator.subtractMethod(number1, number2);

        //Assert
        assertEquals(0, res);
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
    void multiplyMethod_ZeroInputs() {
        //Arrange
        Calculator calculator = new Calculator();
        int number1 = 0;
        int number2 = 5;

        //Act
        int res = calculator.multiplyMethod(number1, number2);

        //Assert
        assertEquals(0, res);
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
    void divideMethod_ZeroInputs() {
        //Arrange
        Calculator calculator = new Calculator();
        int number1 = 10;
        int number2 = 0;

        //Act & Assert
        assertThrows(ArithmeticException.class, () -> {
            calculator.divideMethod(number1, number2);
        });
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