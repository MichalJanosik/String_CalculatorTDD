package service;

import java.util.ArrayList;
import java.util.List;

public class StringParserService {

    public List<Integer> parseString(String input) {
        String[] splitString = input.split("[,:;_/ ]");
        List<Integer> numbers = new ArrayList<>();
        for (var x : splitString) {
            if (x.matches("-?\\d+(\\.\\d+)?")) {
                numbers.add(Integer.parseInt(x));
            }
        }
        return numbers;
    }
}
