import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestRomanTest {

    @Test
    public void fromOneToI() {
        assertEquals("I", new RomanNumbers().toRoman(1));
    }

    @Test
    public void fromTwoToII() {
        assertEquals("II", new RomanNumbers().toRoman(2));
    }

    @Test
    public void fromThreeToIII() {
        assertEquals("III", new RomanNumbers().toRoman(3));
    }

    @Test
    public void fromFourToIV() {
        assertEquals("IV", new RomanNumbers().toRoman(4));
    }
}