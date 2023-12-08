package Code;

import java.util.Scanner;

public class JavaDatatypes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            String numStr = in.next();
            try {
                long num = Long.parseLong(numStr);
                
                System.out.println(num + " can be fitted in:");
                
                if (num >= Byte.MIN_VALUE && num <= Byte.MAX_VALUE) 
                    System.out.println("* byte");
                if (num >= Short.MIN_VALUE && num <= Short.MAX_VALUE) 
                    System.out.println("* short");
                if (num >= Integer.MIN_VALUE && num <= Integer.MAX_VALUE) 
                    System.out.println("* int");
                if (num >= Long.MIN_VALUE && num <= Long.MAX_VALUE) 
                    System.out.println("* long");
                    
            } catch(Exception e) {
                System.out.println(numStr+ " can't be fitted anywhere.");
            }
                       
        }
        in.close();
    }
}
