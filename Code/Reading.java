package Code;

import java.util.Scanner;

public class Reading {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Double d = scan.nextDouble();
        scan.nextLine();
        String value = scan.nextLine();
        
        System.out.println("Value from stdin : "+value);
        System.out.println("Value from stdin : "+d);

        scan.close();
    }
}
