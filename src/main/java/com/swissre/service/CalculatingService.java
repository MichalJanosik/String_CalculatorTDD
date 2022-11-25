package com.swissre.service;

import java.util.List;
import java.util.Objects;

public class CalculatingService {

    public int getSum(List<Integer> input) {
        int sum = 0;
        for (var x : input) {
            if (Objects.nonNull(x)) {
                sum += x;
            }
        }
        return sum;
    }
}
