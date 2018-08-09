package medium;

/**
 * Input: s = "PAYPALISHIRING", numRows = 4
 * Output: "PINALSIGYAHRPI"
 * Explanation:
 * <p>
 * P     I    N
 * A   L S  I G
 * Y A   H R
 * P     I
 */
class ZigZagConversion {
    public static void main(String[] args) {
        System.out.println(convert("ABCDEFGHIJKLMN", 4));
    }

    private static String convert(String s, int numRows) {
        if (numRows == 1) return s;
        char[] data = s.toCharArray();
        int numColumns = data.length;
        char[][] output = new char[numRows][numColumns];
        for (int i = 0; i < numRows; i++)
            output[i] = new char[numColumns];
        int row = 0;
        int column = 0;
        int step = 1;
        for (char aData : data) {
            output[row][column] = aData;
            if (step > 0) {
                if (row + step == numRows) {
                    column += 1;
                    step = -1;
                }
                row = row + step;
            } else {
                if (row + step == -1)
                    step = 1;
                else
                    column += 1;
                row = row + step;
            }
        }
        printOutput(output);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numColumns; j++) {
                if (output[i][j] != 0)
                    sb.append(output[i][j]);
            }
        }
        return sb.toString();
    }

    private static void printOutput(char[][] data) {
        System.out.println(">>> Graph begin");
        for (char[] aData : data) {
            for (int j = 0; j < data[0].length; j++) {
                System.out.print((aData[j] != 0 ? aData[j] : " ") + " ");
            }
            System.out.println();
        }
        System.out.println(">>> Graph end");
    }
}
