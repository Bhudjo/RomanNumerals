import org.junit.Ignore;
import org.junit.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * Created by John on 01-May-16.
 */
public class Arabic2Numeral {
    @org.junit.Test
    public void One() throws Exception {
        assertEquals("I",convert(1));
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

    private String convert(int arabic) {
        String roman = "";
        int remaining = arabic;
        if(arabic-5==-1){
            roman = "IV";
        }else {
            if (arabic-10==-1){
                roman = "IX";
            }else {
                if (arabic - 5 >= 0) {
                    roman = "V";
                    remaining -= 5;
                } else if (arabic - 10 >= 0) {
                    roman = "X";
                    remaining -= 10;
                }
                for (int i = 0; i < remaining; i++) {
                    roman += "I";
                }
            }
        }
        return roman;
    }
}
