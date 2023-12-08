package Code;

import java.util.Scanner;

public class JavaEndOfFile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numLine = 1;
        while (in.hasNext()) {
            String line = in.nextLine();
            System.out.println(numLine+ " "+ line);
            numLine++;
        } 

        in.close();
    }
}
