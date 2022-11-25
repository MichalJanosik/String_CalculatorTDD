package service;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java.util.List;

public class StringParserServiceTest {

    @Test
    void parseString_VARIOUS_DELIMITERS_RETUNS_LIST_OF_INTEGERS() {
        String inputComa = "1,2,3";
        String inputColon = "1:2:3";
        String inputSemiColon = "1;2;3";
        String inputUnderscore = "1_2_3";
        String inputFwdSlash = "1/2/3";
        String inputSpace = "1 2 3";
        List<Integer> expected = List.of(1,2,3);
        StringParserService stringParser = new StringParserService();

        assertEquals(expected, stringParser.parseString(inputComa));
        assertEquals(expected, stringParser.parseString(inputColon));
        assertEquals(expected, stringParser.parseString(inputSemiColon));
        assertEquals(expected, stringParser.parseString(inputUnderscore));
        assertEquals(expected, stringParser.parseString(inputFwdSlash));
        assertEquals(expected, stringParser.parseString(inputSpace));
    }

    @Test
    void parseString_IGNORING_NON_NUMBERS() {
        String inputNullInString = "1,2,null,3";
        List<Integer> expected = List.of(1,2,3);
        StringParserService stringParser = new StringParserService();

        assertEquals(expected, stringParser.parseString(inputNullInString));
    }
}
