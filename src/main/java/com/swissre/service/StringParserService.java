package com.swissre.service;

import java.util.ArrayList;
import java.util.List;

public class StringParserService {

    public List<Integer> parseString(String input) throws Exception {
        String[] splitString = input.split("[,:;_/ ]");
        List<Integer> numbers = new ArrayList<>();
        NumberValidatorService numberValidator = new NumberValidatorService();

        for (var x : splitString) {
            if (numberValidator.stringIsNumber(x)) {
                int number = Integer.parseInt(x);

                if (numberValidator.numberIsValid(number)) {
                    numbers.add(number);
                }
            }
        }

        return numbers;
    }
}
