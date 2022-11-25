package service;

import com.swissre.service.StringParserService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class StringParserServiceTest {

    static StringParserService stringParser;

    @BeforeAll
    static void initialSetup() {
        stringParser = new StringParserService();
    }

    @Test
    void parseString_VARIOUS_DELIMITERS_RETUNS_LIST_OF_INTEGERS() throws Exception {
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
    void parseString_IGNORING_NON_NUMBERS() throws Exception {
        String inputNullInString = "1,2,null,3";
        List<Integer> expected = List.of(1,2,3);

        assertEquals(expected, stringParser.parseString(inputNullInString));
    }

    @Test
    void parseString_NEGATIVE_NUMBERS_THROW_EXCEPTION() throws Exception {
        String inputNegativeString = "1, -1, 2, 3";
        Exception exception = assertThrows(
                Exception.class, () -> stringParser.parseString(inputNegativeString)
        );

        String expectedMessage = "Does not support negative numbers";
        String actualMessage = exception.getMessage();

        assertTrue(expectedMessage.contains(actualMessage));
    }

    @Test
    void parseString_IGNORING_GREATER_THAN_100() throws Exception {
        String inputGreaterThan100 = "1, 2, 101, 3";
        List<Integer> expected = List.of(1,2,3);

        assertEquals(expected, stringParser.parseString(inputGreaterThan100));
    }
}
