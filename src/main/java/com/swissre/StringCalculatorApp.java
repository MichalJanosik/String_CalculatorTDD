package com.swissre;

import com.swissre.service.CalculatingService;
import com.swissre.service.StringParserService;

import java.util.List;
import java.util.Objects;

public class StringCalculatorApp {

    public static void main(String[] args) {
        String input = "1,2,3";
        System.out.printf("Input string: %s%n", input);
        System.out.printf("Output integer: %d", addString(input));
    }

    public static int addString(String input) {
        if (Objects.isNull(input) || input.isBlank()) {
            return 0;
        }

        List<Integer> numbers = new StringParserService().parseString(input);

        return new CalculatingService().getSum(numbers);
    }
}
