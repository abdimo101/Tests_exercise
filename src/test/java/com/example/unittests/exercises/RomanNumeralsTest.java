package com.example.unittests.exercises;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class RomanNumeralsTest {

    private RomanNumerals romanNumerals;

    @BeforeEach
    public void setup() {
        romanNumerals = new RomanNumerals();
    }

    @Test
    public void testRomanToDecimalAAA() {
        // Arrange
        String roman = "IV";

        // Act
        int result = romanNumerals.romanToDecimal(roman);

        // Assert
        assertEquals(4, result);
    }

    @Test
    public void testRomanToDecimalAssertThat() {
        int result = romanNumerals.romanToDecimal("IX");
        assertThat(result).isEqualTo(9);
    }


    @ParameterizedTest
    @MethodSource("romanToDecimalTest")
    public void testRomanToDecimal(String roman, int expected) {
        RomanNumerals romanNumerals = new RomanNumerals();
        int result = romanNumerals.romanToDecimal(roman);
        assertEquals(expected, result);
    }

    private static Stream<Object[]> romanToDecimalTest() {
        return Stream.of(
                new Object[]{"IV", 4},
                new Object[]{"IX", 9},
                new Object[]{"XIII", 13},
                new Object[]{"XXI", 21}
        );
    }

}