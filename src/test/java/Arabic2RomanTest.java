import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Arabic2RomanTest {
    @org.junit.Test
    public void One() throws Exception {
        assertEquals("I", Arabic2Roman.convert(1));
    }

    @Test
    public void Three() throws Exception {
        assertEquals("III", Arabic2Roman.convert(3));
    }

    @Test
    public void Four() throws Exception {
        assertEquals("IV", Arabic2Roman.convert(4));
    }

    @Test
    public void Five() throws Exception {
        assertEquals("V", Arabic2Roman.convert(5));
    }

    @Test
    public void Six() throws Exception {
        assertEquals("VI", Arabic2Roman.convert(6));
    }

    @Test
    public void Eight() throws Exception {
        assertEquals("VIII", Arabic2Roman.convert(8));
    }

    @Test
    public void Nine() throws Exception {
        assertEquals("IX", Arabic2Roman.convert(9));
    }

    @Test
    public void Ten() throws Exception {
        assertEquals("X", Arabic2Roman.convert(10));
    }

    @Test
    public void OneThousandSixtySix() throws Exception {
        assertEquals("MLXVI", Arabic2Roman.convert(1066));
    }

    @Test
    public void OneThousandNineHundredsEightyNine() throws Exception {
        assertEquals("MCMLXXXIX", Arabic2Roman.convert(1989));
    }

}
