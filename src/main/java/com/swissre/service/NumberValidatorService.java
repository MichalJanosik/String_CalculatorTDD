package com.swissre.service;

public class NumberValidatorService {
    public boolean stringIsNumber(String input) {
        return input.matches("-?\\d+(\\.\\d+)?");
    }
}
