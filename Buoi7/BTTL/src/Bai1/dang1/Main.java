package Bai1.dang1;

public class Main
{
    public static void main(String[] args)
    {
        Shape[] a = new Shape[2];
        a[0] = new Circle(15);
        a[1] = new Rectangle(13,45);
        for(int i =0;i<2;i++)
        {
            System.out.println(a[i].area());
        }
    }
}