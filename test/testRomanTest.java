import org.junit.jupiter.api.Test;
import org.junit.Assert;

import static org.junit.jupiter.api.Assertions.*;

class testRomanTest {

    @Test
    public void fromOneToI(){
        assertEquals("I", new RomanNumbers().toRoman(1));
    }
    @Test
    public void fromTwoToII(){
        assertEquals("II", new RomanNumbers().toRoman(2)) ;}
    @Test
    public void fromThreeToIII(){ assertEquals("III", new RomanNumbers().toRoman(3));}

}