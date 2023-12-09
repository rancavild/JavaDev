package Code;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class JavaCurrencyFormatter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double payment = in.nextDouble();
        in.close();


        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat india = NumberFormat.getInstance(Locale.ENGLISH);
        india.setMaximumFractionDigits(2);
        NumberFormat china = NumberFormat.getIntegerInstance(Locale.CHINA);
        china.setMaximumFractionDigits(2);
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        System.out.println("US: "    +us.format(payment));
        System.out.println("India: Rs." +india.format(payment));
        System.out.println("China: ￥" +china.format(payment));
        System.out.println("France: "+france.format(payment));
    }
}
