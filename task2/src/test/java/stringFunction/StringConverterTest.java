package stringFunction;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringConverterTest {

    private StringConverter converter;

    @BeforeEach
    void init() {
        converter = new StringConverter();
    }

    @Test
    void convertStringShouldPassString() {
        String givenString = "12,34.56;67+";
        converter.convertString(givenString);
    }

    @Test
    void convertStringShouldReturnString() {
        String givenString = "12,34.56;67+";
        String result = converter.convertString(givenString);
        String expected = "169";
        assertEquals(expected, result);
    }

    @Test
    void subtractAllShouldReturnInt() {
        String[] separatedNums = {"1"};
        int result = converter.subtractAll(separatedNums, 0);
        int expected = -1;
        assertEquals(expected, result);
    }

    @Test
    void addAllShouldReturnInt() {
        String[] separatedNums = {"1"};
        int result = converter.addAll(separatedNums, 0);
        int expected = 1;
        assertEquals(expected, result);
    }

    @Test
    void multiplyAllShouldReturnInt() {
        String[] separatedNums = {"1"};
        int result = converter.multiplyAll(separatedNums, 0);
        int expected = 1;
        assertEquals(expected, result);
    }

    @Test
    void divisionAllShouldReturnDouble() {
        String[] separatedNums = {"1"};
        double result = converter.divisionAll(separatedNums, 0);
        double expected = 1;
        assertEquals(expected, result);
    }
}