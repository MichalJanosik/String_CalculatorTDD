package com.swissre.service;

import java.util.Objects;

public class NumberValidatorService {
    public boolean stringIsNumber(String input) {
        if (Objects.isNull(input)) {
            return false;
        }
        return input.matches("-?\\d+(\\.\\d+)?");
    }

    public boolean numberIsValid(int number) {
        if (number < 0) {
            throw new RuntimeException("Does not support negative numbers");
        }
        return number <= 100;
    }
}
