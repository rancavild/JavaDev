package designpatterns.singleton;

public class Singleton2 {
    private static Singleton2 instance;

    private Singleton2() {
    }

    public static Singleton2 getInstance(String value) {
        if(instance == null) {
            return new Singleton2();
        }
        return instance;
    } 
    
    public int sum(int a, int b) {
        return a + b;
    }
}
