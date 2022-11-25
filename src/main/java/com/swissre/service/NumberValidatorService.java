package com.swissre.service;

import java.util.Objects;

public class NumberValidatorService {
    public boolean stringIsNumber(String input) {
        if (Objects.isNull(input)) {
            return false;
        }
        return input.matches("-?\\d+(\\.\\d+)?");
    }

    public boolean numberIsValid(int number) throws Exception {
        if (number < 0) {
            throw new Exception("Does not support negative numbers");
        }
        return number <= 100;
    }
}
