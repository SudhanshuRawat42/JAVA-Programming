package exercise3;

public class OverloadExample {
    public static void display(int a) {
        System.out.println("Displaying integer: " + a);
    }

    public static void display(String a) {
        System.out.println("Displaying string: " + a);
    }

    public static void display(double a) {
        System.out.println("Displaying double: " + a);
    }
}
