package Code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collections {

    private static List<Integer> reverse(List<Integer> numbers) {
        int[] nums = numbers.stream().mapToInt(i->i).toArray();
        int i = 0;
        int j = nums.length - 1;
        
        while (i < j) {
            int aux = nums[i];
            nums[i] = nums[j];
            nums[j] = aux;
            i++;
            j--;
        }

        return Arrays.stream(nums).boxed().toList();
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        int[] nums = new int[10];
        int[] slices = new int[10];

        for (int i = 0; i < 10; i++) {
            nums[i] = (i+1)*100;
        }

        for (int i=1; i <= 10; i++) {
            numbers.add(i);
        }

        for(Integer number : numbers) {
            System.out.println(number);
        }

        List<Integer> revered = numbers.reversed();
        for(Integer number : revered) {
            System.out.println(number);
        }

        List<Integer> reversedInts = reverse(numbers);
        for(Integer number : reversedInts) {
            System.out.println(number);
        }

        for (int n : nums) {
            System.out.println(n);
        }

        for (int i = 0; i < 10; i++) {
            slices[i] = (i+1)*4;
        }

        for (int n : slices) {
            System.out.println(n);
        }
    }
}
