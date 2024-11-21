package eu.mobilo24.java101;

public class Main {
    public static void main(String[] args) {

        Rectangle r = new Rectangle(5, 4);
        System.out.println("Rectangle perimeter: " + r.perimeter());
        System.out.println("Rectangle area: " + r.area());

        Triangle t = new Triangle(4, 5, 6);
        System.out.println("Triangle perimeter: " + t.perimeter());
        System.out.println("Triangle area: " + t.area());
    }
}