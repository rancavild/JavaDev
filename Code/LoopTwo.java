package Code;

import java.util.ArrayList;
import java.util.List;

public class LoopTwo {

    private static int pow(int a, int b) {
        int r = 1;
        for (int i=1; i<=b;i++) {
            r*=a;
        }
        return r;
    }

    public static void main(String[] args) {
        List<Integer> result = new ArrayList<>();
        int a = 0;
        int b = 2;
        int n = 10;

        int s = a + pow(2,0) * b;
        result.add(s);

        for (int i=1; i < n - 1; i++) {
            s += a + (int)pow(2,i) * b;
            result.add(s);  
        }

        System.out.println(result);
    }
}
