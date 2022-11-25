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
        return (number >= 0) && (number <= 100);
    }
}
