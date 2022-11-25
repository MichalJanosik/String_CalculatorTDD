import static org.junit.jupiter.api.Assertions.assertEquals;

import com.swissre.StringCalculatorApp;
import org.junit.jupiter.api.Test;

public class StringCalculatorAppTest {

    @Test
    void addString_EMPTY_RETURN_ZERO() {
        assertEquals(0, StringCalculatorApp.addString(""));
    }

    @Test
    void addString_NULL_RETURN_ZERO() {
        assertEquals(0, StringCalculatorApp.addString(null));
    }
}
