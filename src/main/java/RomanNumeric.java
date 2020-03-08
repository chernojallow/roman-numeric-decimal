import java.math.BigDecimal;

public class RomanNumeric {

    int valueToConvert(char r) {
        if (r == 'I')
            return 1;
        if (r == 'V')
            return  5;
        if (r == 'X')
            return  10;
        if (r == 'L')
            return  50;
        if (r == 'C')
            return  100;
        if (r == 'D')
            return  500;
        if (r == 'M')
            return  1000;
        return  -1;

    }


    // Finds decimal value of a given romal numeral
    int romanToDecimal(String str)
    {
        // Initialize result

        int result = 0;

        for (int i=0; i<str.length(); i++)
        {
            // Getting value of symbol s[i]
            int s1 = valueToConvert(str.charAt(i));

            System.out.println("S1:" + s1);


            // Getting value of symbol s[i+1]
            if (i+1 < str.length())
            {
                int s2 = valueToConvert(str.charAt(i+1));

                System.out.println("S2:" + s2);

                // Comparing both values
                if (s1 >= s2)

                {
                    // Value of current symbol is greater
                    // or equalto the next symbol
                    result = result + s1;
                }
                else
                {
                    result = result + s2 - s1;
                    i++; // Value of current symbol is
                    // less than the next symbol
                }
            }
            else
            {
                result = result + s1;
                i++;
            }
        }

        return result;
    }
}
