package service;

import com.swissre.service.NumberValidatorService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NumberValidatorServiceTest {

    static NumberValidatorService numberValidator;

    @BeforeAll
    static void initialSetup() {
        numberValidator = new NumberValidatorService();
    }

    @Test
    void stringIsNumber_OK() {
        String input = "1";

        assertTrue(numberValidator.stringIsNumber(input));
    }

    @Test
    void stringIsNumber_NOT_NUMBER() {
        String input = "a";

        assertFalse(numberValidator.stringIsNumber(input));
    }

    @Test
    void stringIsNumber_NULL() {
        String input = null;

        assertFalse(numberValidator.stringIsNumber(input));
    }

    @Test
    void stringIsNumber_EMPTY() {
        String input = "";

        assertFalse(numberValidator.stringIsNumber(input));
    }

    @Test
    void numberIsValid_OK() {
        int number = 1;

        assertTrue(numberValidator.numberIsValid(number));
    }

    @Test
    void numberIsValid_NEGATIVE_NUMBER() {
        int number = -1;

        assertFalse(numberValidator.numberIsValid(number));
    }

    @Test
    void numberIsValid_GREATER_THAN_100() {
        int number = 101;

        assertFalse(numberValidator.numberIsValid(number));
    }
}
