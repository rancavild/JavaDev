package Code;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class JavaConvertDate {
    private static String convertDate(String dateStr) {
        String[] date = dateStr.split(" ");

        String monthStr = date[0].toLowerCase();
        int month = 0;
        int year = Integer.parseInt(date[2]);
        int day = Integer.parseInt(date[date.length-1]);

        if (monthStr.equals("enero")) month = 1;
        else if (monthStr.equals("febrero")) month = 2;
        else if (monthStr.equals("marzo")) month = 3;
        else if (monthStr.equals("abril")) month = 4;
        else if (monthStr.equals("mayo")) month = 5;
        else if (monthStr.equals("junio")) month = 6;
        else if (monthStr.equals("julio")) month = 7;
        else if (monthStr.equals("agosto")) month = 8;
        else if (monthStr.equals("septiembre")) month = 9;
        else if (monthStr.equals("octubre")) month = 10;
        else if (monthStr.equals("noviembre")) month = 11;
        else if (monthStr.equals("diciembre")) month = 12;

        Calendar calendar = Calendar.getInstance();

        calendar.set(Calendar.MONTH, month-1);
        calendar.set(Calendar.DAY_OF_MONTH, day);
        calendar.set(Calendar.YEAR, year);
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        return format.format(calendar.getTime());
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String date = in.nextLine();
        in.close();

        System.out.println(convertDate(date));
    }
}
