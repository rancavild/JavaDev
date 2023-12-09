package Code;

import java.util.List;

public class ApplesAndOranges {
    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        long apple_counter = 0;
        long orange_counter = 0;
        for (Integer d : apples) {
            if (a + d >= s && a + d <= t) apple_counter++;
        }
        System.out.println(apple_counter);
        for (Integer d : oranges) {
            if (b + d >= s && b + d <= t) orange_counter++;
        }
        System.out.println(orange_counter);
    }
}
