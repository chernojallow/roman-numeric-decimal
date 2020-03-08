

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.math.BigDecimal;


import static org.junit.jupiter.api.Assertions.*;


public class RomanNumericTest {

    RomanNumeric rn;


    @BeforeEach
    public void setUp() {
       rn = new RomanNumeric();

    };

    @Test
    public void romanToNumericOne(){
        RomanNumeric romanNumeric = new RomanNumeric();
        String actual = "I";
        Integer expected = 1;
        assertEquals(romanNumeric.romanToDecimal(actual),expected);
    }


    @Test
    public void romanToNumericTwo(){
        RomanNumeric romanNumeric = new RomanNumeric();
        String actual = "V";
        Integer expected = 5;
        assertEquals(romanNumeric.romanToDecimal(actual),expected);
    }


    @Test
    public void romanToNumericThree(){
        RomanNumeric romanNumeric = new RomanNumeric();
        String actual = "X";
        Integer expected = 10;
        assertEquals(romanNumeric.romanToDecimal(actual),expected);
    }



    @Test
    public void romanToNumericFour(){
        RomanNumeric romanNumeric = new RomanNumeric();
        String actual = "L";
        Integer expected = 50;
        assertEquals(romanNumeric.romanToDecimal(actual),expected);
    }


    @Test
    public void romanToNumericFive(){
        RomanNumeric romanNumeric = new RomanNumeric();
        String actual = "C";
        Integer expected = 100;
        assertEquals(romanNumeric.romanToDecimal(actual),expected);
    }


    @Test
    public void romanToNumericSix(){
        RomanNumeric romanNumeric = new RomanNumeric();
        String actual = "D";
        Integer expected = 500;
        assertEquals(romanNumeric.romanToDecimal(actual),expected);
    }


    @Test
    public void romanToNumericSeven(){
        RomanNumeric romanNumeric = new RomanNumeric();
        String actual = "M";
        Integer expected = 1000;
        assertEquals(romanNumeric.romanToDecimal(actual),expected);
    }

    @Test
    public void romanToNumericAddition(){
        RomanNumeric romanNumeric = new RomanNumeric();
        String actual = "MCMIV";
        Integer expected = 1904;
        assertEquals(romanNumeric.romanToDecimal(actual),expected);
    }


}
