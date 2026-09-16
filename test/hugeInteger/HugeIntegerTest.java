package hugeInteger;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HugeIntegerTest {
    @Test
    public void testParseAndtoStringReturnsTheSameNumber() {
        HugeInteger hugeInteger = new HugeInteger();
        hugeInteger.parse("123456");
        assertEquals("123456", hugeInteger.toString());
    }

    @Test
    public void testisZeroShouldReturnTrueForZero(){
    HugeInteger hugeInteger = new HugeInteger();
    hugeInteger.parse("000");
    assertTrue(hugeInteger.isZero());

    }

    @Test
    public void testTwoHugeIntegerWithTheSamevalueShoudBeEqual(){
        HugeInteger firstChar = new HugeInteger();
        HugeInteger secondChar = new HugeInteger();
        firstChar.parse("1235");
        secondChar.parse("1235");
        assertTrue(firstChar.isEqualTo(secondChar));

    }
    @Test
    public void testAddition(){
        HugeInteger firstChar = new HugeInteger();
        HugeInteger secondChar = new HugeInteger();
        firstChar.parse("999");
        secondChar.parse("1");
        HugeInteger sum = firstChar.add(secondChar);
        assertEquals("1000", sum.toString());
    }
}