package designpatterns.singleton;

public final class Singleton {
    private static Singleton instace;
    public String value;

    private Singleton(String value) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        if(instace == null) {
            instace = new Singleton(value);
        }
        return instace;
    }

}