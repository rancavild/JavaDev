package Code;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LoopTwo {

    private static int pow(int a, int b) {
        int r = 1;
        for (int i=1; i<=b;i++) {
            r*=a;
        }
        return r;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i=0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            int s = a;
            for (int j = 0; j < n; j++) {
                s += pow(2, j)*b;
                System.out.print(s+" ");
            }
            System.out.println();
        }
        in.close();
    }
}
