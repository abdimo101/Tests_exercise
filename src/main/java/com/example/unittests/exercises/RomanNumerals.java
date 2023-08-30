package com.example.unittests.exercises;

import java.util.HashMap;
import java.util.Map;

import static javax.management.Query.value;

public class RomanNumerals {
    private Map<Character, Integer> romanValues;
    public RomanNumerals(){
        romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);
    }

    public int romanToDecimal(String roman){
        int res = 0;
        int prevValue = 0;

        for (int i = roman.length() - 1; i >= 0; i--) {
            char currentSymbol = roman.charAt(i);
            int currentValue = romanValues.get(currentSymbol);

            if (currentValue < prevValue) {
                res -= currentValue;
            } else {
                res += currentValue;
            }
            prevValue = currentValue;
        }
        return res;
    }

}
