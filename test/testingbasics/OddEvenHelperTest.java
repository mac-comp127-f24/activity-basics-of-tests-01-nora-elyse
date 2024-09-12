package testingbasics;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class OddEvenHelperTest {
    @Test
    void evenNumbers() {
        assertEquals(true, OddEvenHelper.isEven(24));
        assertEquals(false, OddEvenHelper.isOdd(24));
    }

    @Test
    void oddNumbers() {
        assertEquals(false, OddEvenHelper.isEven(17));
        assertEquals(true, OddEvenHelper.isOdd(17));
    }

    @Test
    void zero() {
        assertEquals(true, OddEvenHelper.isEven(0));
        assertEquals(false, OddEvenHelper.isOdd(0));
    }

    @Test
    void negativeOdd() {
        assertEquals(false, OddEvenHelper.isEven(-3));
        assertEquals(true, OddEvenHelper.isOdd(-3));

    }

    @Test
    void negativeEven() {
        assertEquals(true, OddEvenHelper.isEven(-4));
        assertEquals(false, OddEvenHelper.isOdd(-4));

    }
}
