import java.util.Scanner;
public class Student
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tn của bạn: ");
        String name = sc.nextLine   ();

        System.out.print("first number: ");
        int number1 = sc.nextInt  ();

        System.out.print("second number: ");
        double number2 = sc.nextDouble ();

        //System.out.print("A : ");
        //boolean TorF = sc.nextBoolean ();
        System.out.println("Xin chào " + name);
        System.out.println("your first number is " + number1);
        System.out.println("your second number is " + number2);
        //System.out.println("chat is this true? "+ TorF);
    }
}
