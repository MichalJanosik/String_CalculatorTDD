package com.swissre;

import java.util.Objects;

public class StringCalculatorApp {

    public static void main(String[] args) {

    }

    public static int addString(String input) {
        if (Objects.isNull(input) || input.isBlank()) {
            return 0;
        }
        return 1;
    }
}
