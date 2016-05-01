public class Arabic2Roman {

    static final String[] ROMANSYMB = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    static final int[] ARABICVAL = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

    public static String convert(int arabic) {
        StringBuilder roman = new StringBuilder();
        int remaining = arabic;

        for (int i = 0; i < ROMANSYMB.length; i++) {
            remaining = substitute(remaining, ROMANSYMB[i], ARABICVAL[i], roman);
        }

        return roman.toString();
    }

    private static int substitute(int number, String roman, int arabic, StringBuilder result) {
        int remaining = number;
        while (remaining >= arabic) {
            result.append(roman);
            remaining -= arabic;
        }
        return remaining;
    }
}
