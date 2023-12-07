package Code;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {
    private static void addParenthesis(List<String> s, int n, int left, int right, String val) {
        if (left == right && left == n) {
             s.add(val);
             return;
        }
        if (left < n) {
            addParenthesis(s, n, left+1, right, val+"(");
        } 
        if (right < left) {
            addParenthesis(s, n, left, right+1, val+")");
        }
    }

    private static List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        addParenthesis(res, n, 0, 0, "");

        return res;
    }

    public static void main(String[] args) {
        List<String> res = generateParenthesis(3);

        System.out.println(res);

        res = generateParenthesis(1);

        System.out.println(res);
    }
}
