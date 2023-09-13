package com.example.unittests.exercises;

import org.springframework.cglib.core.Converter;

public class Calculator {

    public int sumMethod(int number1, int number2){
        int sum = number1 + number2;
        return sum;
    }

    public int subtractMethod(int number1, int number2){
        int subtract = number1 - number2;
        return subtract;
    }

    public int multiplyMethod(int number1, int number2){
        int multiply = number1 * number2;
        return multiply;
    }

    public int divideMethod(int number1, int number2){
        int divide = number1 / number2;
        return divide;
    }

    public double convertIntToDouble(int number){
        double res;
        res = number;
        return res;
    }
}
