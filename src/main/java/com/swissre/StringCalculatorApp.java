package com.swissre;

import com.swissre.service.CalculatingService;
import com.swissre.service.StringParserService;

import java.util.List;
import java.util.Objects;

public class StringCalculatorApp {

    public static void main(String[] args) {
        String input = "1,2,3,101";
        String inputNegat = "1 -2 3";
        System.out.printf("Input string: %s%n", input);
        System.out.printf("Output integer: %d%n", addString(input));
        System.out.println(addString(inputNegat));
    }

    public static int addString(String input) {
        if (Objects.isNull(input) || input.isBlank()) {
            return 0;
        }

        List<Integer> numbers = null;

        try {
            numbers = new StringParserService().parseString(input);
        } catch (Exception e) {
            System.err.println(e.getMessage());
            System.exit(0);
        }

        return new CalculatingService().getSum(numbers);
    }
}
