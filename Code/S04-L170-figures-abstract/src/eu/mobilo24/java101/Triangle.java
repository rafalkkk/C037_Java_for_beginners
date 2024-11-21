package eu.mobilo24.java101;

public class Triangle extends Figure{

    private double a = 0;
    private double b = 0;
    private double c = 0;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double perimeter(){
        return a+b+c;
    }

    @Override
    public double area(){
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

}
