package com.example.unittests.exercises;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class EmployeesTest {
    private Employees employee;

    @BeforeEach
    void setUp() {
        employee = new Employees("130905", "Lars", "Larsen", "IT", 50000, 2, null, null, "Denmark");
    }

    @ParameterizedTest
    @ValueSource(strings = {"1234567890", "9876543210"})
    void validCprNumbers(String cpr) {
        employee.setCpr(cpr);
        assertEquals(cpr, employee.getCpr());
    }

    @ParameterizedTest
    @ValueSource(strings = {"123456789", "98765432"})
    void invalidCprNumbers(String cpr) {
        assertThrows(IllegalArgumentException.class, () -> employee.setCpr(cpr));
    }

    @ParameterizedTest
    @ValueSource(strings = {"Lars", "Louise", "A-B C-D E-F G-H I-J K-L M-N O "})
    void validFirstNames(String firstName) {
        employee.setFirst_name(firstName);
        assertEquals(firstName, employee.getFirst_name());
    }

    @ParameterizedTest
    @ValueSource(strings = {"", "A B C D E F G H I J K L M N O P Q R S T U V W X Y Z A"})
    void invalidFirstNames(String firstName) {
        assertThrows(IllegalArgumentException.class, () -> employee.setFirst_name(firstName));
    }

    @ParameterizedTest
    @ValueSource(strings = {"01/01/2000", "15/05/1990"})
    void validDateOfBirth(String dob) throws ParseException {
        employee.setDate_of_birth(dob);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date expectedDate = dateFormat.parse(dob);
        assertEquals(expectedDate, employee.getDate_of_birth());
    }

    @ParameterizedTest
    @ValueSource(strings = {"13/09/2023", "15/05/2010"})
    void invalidDateOfBirth(String dob) throws ParseException {
        assertThrows(IllegalArgumentException.class, () -> employee.setDate_of_birth(dob));
    }

}