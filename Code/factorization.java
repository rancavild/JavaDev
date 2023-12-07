package Code;

public class factorization {

    public static int letras(int z, int u) {
        int c = 1;
        for(int x = 0; x < u; x++) {
            c *= z;
        }
        return c;   
    }
    public static void main(String[] args) {
        System.out.println(letras(2,4));
    }
}
