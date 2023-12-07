package Code;

import java.util.Stack;

public class DataStructure {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.add("Rodrigo");
        stack.add("Ancavil");

        System.out.println(stack);

        stack.removeFirst();

        System.out.println(stack);
    }
}
