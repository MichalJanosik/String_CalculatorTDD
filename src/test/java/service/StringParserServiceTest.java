package service;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.swissre.service.StringParserService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

public class StringParserServiceTest {

    static StringParserService stringParser;

    @BeforeAll
    static void initialSetup() {
        stringParser = new StringParserService();
    }

    @Test
    void parseString_VARIOUS_DELIMITERS_RETUNS_LIST_OF_INTEGERS() {
        String inputComa = "1,2,3";
        String inputColon = "1:2:3";
        String inputSemiColon = "1;2;3";
        String inputUnderscore = "1_2_3";
        String inputFwdSlash = "1/2/3";
        String inputSpace = "1 2 3";
        List<Integer> expected = List.of(1,2,3);

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

        assertEquals(expected, stringParser.parseString(inputNullInString));
    }

    @Test
    void parseString_IGNORING_NEGATIVE_NUMBERS() {
        String inputNegativeString = "1, -1, 2, 3";
        List<Integer> expected = List.of(1,2,3);

        assertEquals(expected, stringParser.parseString(inputNegativeString));
    }

    @Test
    void parseString_IGNORING_GREATER_THAN_100() {
        String inputGreaterThan100 = "1, 2, 101, 3";
        List<Integer> expexted = List.of(1,2,3);

        assertEquals(expexted, stringParser.parseString(inputGreaterThan100));
    }


}
