package designpatterns.singleton;

public class SingleThread {
    public static void main(String args[]) {
        System.out.println("Singleton design pattern");
        Singleton singleton1 = Singleton.getInstance("Foo");
        Singleton singleton2 = Singleton.getInstance("Bar");

        System.out.println(singleton1.value);
        System.out.println(singleton2.value);

        Singleton2 singleton21 = Singleton2.getInstance("Rodrigo");
        Singleton2 singleton22 = Singleton2.getInstance("Teo");

        System.out.println(singleton21.sum(1, 1));
        System.out.println(singleton22.sum(2,2));

        System.out.println(singleton21.getClass().hashCode());
        System.out.println(singleton22.getClass().hashCode());
    }
}