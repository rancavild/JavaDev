package Code;

import java.lang.Exception;
import java.util.Scanner;

public class JavaStaticInitializerBlock {
    static boolean execute; 
    static int B, H;

    static {
        Scanner in = new Scanner(System.in);
        
        B = in.nextInt();
        H = in.nextInt();
        if (B <= 0 || H <= 0) {
            execute = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        } else {
            execute = true;
        }
        in.close();
    }
    
    public static void main(String[] args) {
        if (execute) System.out.println(B*H);
    }    
}
