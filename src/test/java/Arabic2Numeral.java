import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Arabic2Numeral {
    @org.junit.Test
    public void One() throws Exception {
        assertEquals("I", convert(1));
    }

    @Test
    public void Three() throws Exception {
        assertEquals("III", convert(3));
    }

    @Test
    public void Four() throws Exception {
        assertEquals("IV", convert(4));
    }

    @Test
    public void Five() throws Exception {
        assertEquals("V", convert(5));
    }

    @Test
    public void Six() throws Exception {
        assertEquals("VI", convert(6));
    }

    @Test
    public void Eight() throws Exception {
        assertEquals("VIII", convert(8));
    }

    @Test
    public void Nine() throws Exception {
        assertEquals("IX", convert(9));
    }

    @Test
    public void Ten() throws Exception {
        assertEquals("X", convert(10));
    }

    private String convert(int arabic) {

        StringBuilder roman = new StringBuilder();
        int remaining = arabic;

        remaining = dosomething(remaining, "X", 10, roman);
        remaining = dosomething(remaining, "IX", 9, roman);
        remaining = dosomething(remaining, "V", 5, roman);
        remaining = dosomething(remaining, "IV", 4, roman);

        for (int i = 0; i < remaining; i++) {
            roman.append("I");
        }
        return roman.toString();
    }

    private int dosomething(int num, String roman, int arabic, StringBuilder result) {
        int remaining = num - arabic;
        if (remaining >= 0) {
            result.append(roman);
            return remaining;
        }
        return num;
    }
}
