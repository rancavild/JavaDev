package Code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CutTheStick {
    
    private static List<Integer> cutTheSticks(List<Integer> arr) {
        List<Integer> result = new ArrayList<>();
       
        while (!arr.isEmpty()) {
            Integer lenOfCut = Collections.min(arr);
            Integer sticksCut = arr.size();
            arr.removeIf(n-> n == lenOfCut);
            result.add(sticksCut);
            arr.remove(lenOfCut);
            arr.forEach(n->n = (n-sticksCut));
        }

        return result;
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4,3,3,2,1));

        List<Integer> r = cutTheSticks(arr);
        System.out.println(r);
    }
}
