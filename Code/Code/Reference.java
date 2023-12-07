package Code.Code;

import java.util.ArrayList;
import java.util.List;

public class Reference {
    private static void byReference(Object[] arr, int n, Integer val) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)arr[i]*20;
        }

        n = n*10000;

        val = val * 3000;
        System.out.println("==========================");
    }

    public static void main(String[] args) {
        List<Integer> arrInts = new ArrayList<>();
        arrInts.add(10);
        arrInts.add(20);

        Object[] arr = arrInts.toArray();
        int n = 10;
        Integer val = 45;

        System.out.println(arrInts);
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
        System.out.println(n);
        System.out.println(val);

        byReference(arr, n, val);



        System.out.println(arrInts);
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
        System.out.println(n);
        System.out.println(val);
    }
}
