package service;

import com.swissre.service.NumberValidatorService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class NumberValidatorServiceTest {

    @Test
    void stringIsNumber_OK() {
        String input = "1";

        assertTrue(new NumberValidatorService().stringIsNumber(input));
    }


}
