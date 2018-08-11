package medium;

/**
 * Input: 58
 * Output: "LVIII"
 * Explanation: C = 100, L = 50, XXX = 30 and III = 3.
 */
class IntegerToRoman {
    public static void main(String[] args) {
        System.out.println(intToRoman(10));
    }

    private static String intToRoman(int num) {
        String romans[][] = {
                {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"}, //1-9
                {"X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"}, //10-90
                {"C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"}, //100-900
                {"M", "MM", "MMM"}
        };//1000-3000
        StringBuilder sb = new StringBuilder();
        int i = -1;
        while (num > 0) {
            i++;
            if (num % 10 > 0)
                sb.insert(0, romans[i][num % 10 - 1]);
            num = num / 10;
        }
        return sb.toString();
    }
}
