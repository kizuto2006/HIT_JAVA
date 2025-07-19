import java.util.Scanner;
public class bai3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số a = ");
        int a = sc.nextInt();
        System.out.print("Nhập số b : ");
        int b = sc.nextInt();
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println((double) a/b);
        System.out.println(a%b);
        if(a == b)
        {
            System.out.println("a bằng b");
        }
        else
        {
            System.out.println("a không bằng b");
        }

    }
}
