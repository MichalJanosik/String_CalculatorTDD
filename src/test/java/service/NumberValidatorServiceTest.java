package service;

import com.swissre.service.NumberValidatorService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NumberValidatorServiceTest {

    @Test
    void stringIsNumber_OK() {
        String input = "1";

        assertTrue(new NumberValidatorService().stringIsNumber(input));
    }

    @Test
    void stringIsNumber_NOT_NUMBER() {
        String input = "a";

        assertFalse(new NumberValidatorService().stringIsNumber(input));
    }

    @Test
    void stringIsNumber_NULL() {
        String input = null;

        assertFalse(new NumberValidatorService().stringIsNumber(input));
    }

    @Test
    void stringIsNumber_EMPTY() {
        String input = "";

        assertFalse(new NumberValidatorService().stringIsNumber(input));
    }

    @Test
    void numberIsValid_OK() {
        int number = 1;

        assertTrue(new NumberValidatorService().numberIsValid(number));
    }

    @Test
    void numberIsValid_NEGATIVE_NUMBER() {
        int number = -1;

        assertFalse(new NumberValidatorService().numberIsValid(number));
    }

    @Test
    void numberIsValid_GREATER_THAN_100() {
        int number = 101;

        assertFalse(new NumberValidatorService().numberIsValid(number));
    }
}
