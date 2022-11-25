package com.swissre.service;

import java.util.ArrayList;
import java.util.List;

public class StringParserService {

    public List<Integer> parseString(String input) {
        String[] splitString = input.split("[,:;_/ ]");
        List<Integer> numbers = new ArrayList<>();
        for (var x : splitString) {
            if (x.matches("-?\\d+(\\.\\d+)?")) {
                int number = Integer.parseInt(x);
                if ((number >= 0) && (number <= 100)) {
                    numbers.add(number);
                }
            }
        }
        return numbers;
    }
}
