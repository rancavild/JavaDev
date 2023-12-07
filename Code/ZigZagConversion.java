package Code;

public class ZigZagConversion {
    public static String convert(String s, int numRows) {
        int n = s.length();
        StringBuffer[] strs = new StringBuffer[numRows];

        for (int i=0; i < numRows; i++) {
            strs[i] = new StringBuffer();
        }

        int i = 0;
        while (i < n) {
            for (int j=0; j <numRows && i<n; j++) {
                strs[j].append(s.charAt(i++));
            }
            for (int j=numRows-2; j>0 && i<n; j--) {
                strs[j].append(s.charAt(i++));
            }
        }

        StringBuffer result = new StringBuffer();
        for (StringBuffer str : strs) {
            result.append(str);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String r = convert("PAYPALISHIRING", 3);

        System.out.println(r);

        r = convert("PAYPALISHIRING", 4);

        System.out.println(r);
    }
}
