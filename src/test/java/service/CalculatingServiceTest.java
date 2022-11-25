package service;

import com.swissre.service.CalculatingService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatingServiceTest {

    static CalculatingService calculatingService;

    @BeforeAll
    static void initialSetup() {
        calculatingService = new CalculatingService();
    }

    @Test
    void getSum_OK() {
        List<Integer> input = List.of(1,2,3);
        int expected = 6;

        assertEquals(expected, calculatingService.getSum(input));
    }

    @Test
    void getSum_NULL_ELEMENT() {
        List<Integer> input = new ArrayList<>();
        input.add(1);
        input.add(2);
        input.add(null);
        input.add(3);
        int expected = 6;

        assertEquals(expected, calculatingService.getSum(input));
    }

    @Test
    void getSum_EMPTY_LIST() {
        List<Integer> input = new ArrayList<>();
        int expected = 0;

        assertEquals(expected, calculatingService.getSum(input));
    }
}
