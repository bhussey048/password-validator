package com.example.brandonhussey.a2;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by brandonhussey on 2018-02-09.
 */
public class ValidatorTest {
    @Test
    public void checkPassword() throws Exception {

        String input = "password";
        boolean output;
        boolean expected = false;

        Validator validator = new Validator();
        output = validator.checkPassword(input);

        assertEquals(expected, output);

    }

    @Test
    public void checkLength() throws Exception {

        String input = "12345";
        boolean output;
        boolean expected = false;

        Validator validator = new Validator();
        output = validator.checkLength(input);

        assertEquals(expected, output);
    }


    @Test
    public void checkSpecialChar() throws Exception {

        String input = "qwerty1!";
        boolean output;
        boolean expected = true;

        Validator validator = new Validator();
        output = validator.checkSpecialChar(input);

        assertEquals(expected, output);
    }

    @Test
    public void checkDigit() throws Exception {

        String input = "nodigits";
        boolean output;
        boolean expected = false;

        Validator validator = new Validator();
        output = validator.checkDigit(input);

        assertEquals(expected, output);
    }

    @Test
    public void checkUpperCase() throws Exception {

        String input = "UppeRcAse";
        boolean output;
        boolean expected = true;

        Validator validator = new Validator();
        output = validator.checkLength(input);

        assertEquals(expected, output);
    }
}