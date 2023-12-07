package Code;

public class LoopOne {
    private static void loop(int N) {
        for (int i=1; i <= 10; i++) {
            System.out.format("%d x %d = %d\n", N, i, N*i);
        }
    }

    public static void main(String[] args) {
        int N = 2;
        loop(N);
    }
}
