package Code;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class NumberLineJump {
    private static String kangaroo(int x1, int v1, int x2, int v2) {
        if (x1 == x2) return "YES";
        int diff = v1 > v2 ? v1 - v2 : v2 - v1;
        if (diff == 0) return "NO";
            
        int xdiff = x1 - x2;
        int vdiff = v2 - v1;
            
        if((xdiff < 0 && vdiff < 0) || (xdiff > 0 && vdiff > 0)) {
            int modX = xdiff % vdiff;
            int modV = vdiff % xdiff;
            if (modX == 0 || modV == 0) return "YES";
        }
        return "NO";
    }

    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int x1 = Integer.parseInt(firstMultipleInput[0]);

        int v1 = Integer.parseInt(firstMultipleInput[1]);

        int x2 = Integer.parseInt(firstMultipleInput[2]);

        int v2 = Integer.parseInt(firstMultipleInput[3]);

        String result = kangaroo(x1, v1, x2, v2);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
