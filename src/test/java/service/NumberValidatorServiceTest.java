package service;

import com.swissre.service.NumberValidatorService;
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


}
