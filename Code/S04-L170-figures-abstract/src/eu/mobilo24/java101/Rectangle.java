package eu.mobilo24.java101;

public class Rectangle extends Figure {

    private double a = 0;
    private double b = 0;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double perimeter(){
        return 2*(a+b);
    }

    @Override
    public double area(){
        return a*b;
    }
}
