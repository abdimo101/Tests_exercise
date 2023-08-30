package com.example.unittests;

import com.example.unittests.exercises.Calculator;
import com.example.unittests.exercises.RomanNumerals;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UnittestsApplication {

    public static void main(String[] args) {
        SpringApplication.run(UnittestsApplication.class, args);
        Calculator cal = new Calculator();
        RomanNumerals converter = new RomanNumerals();
        String romanNumeral = "XVIII";
        //System.out.println("Sum: " + cal.sumMethod(12, 8));
        //System.out.println("Subtract: " + cal.subtractMethod(25, 12));
        //System.out.println("Multiply: " + cal.multiplyMethod(5, 5));
        //System.out.println("Divide: " + cal.divideMethod(100, 5));

        System.out.println("Roman numerals "+ romanNumeral + " to decimals: " + converter.romanToDecimal(romanNumeral));
    }

}
