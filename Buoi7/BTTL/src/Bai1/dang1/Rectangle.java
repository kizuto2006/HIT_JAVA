package Bai1.dang1;

public class Rectangle extends Shape
{
    private double cd;
    private double cr;
    @Override
    public double area() {
        return cd*cr;
    }

    public Rectangle(double cd, double cr) {
        this.cd = cd;
        this.cr = cr;
    }
}
