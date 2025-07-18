import java.util.Scanner;

public class bai1
{
    public static void main(String[] args)
    {
        Scanner quet = new Scanner(System.in);
        System.out.print("Họ và tên : ");
        String ten = quet.nextLine();
        System.out.print("Tuổi của bạn là : ");
        int tuoi = quet.nextInt();
        System.out.print("Bạn có chiều cao là : ");
        float cao = quet.nextFloat();

        System.out.println("Xin chào " + ten + ", bạn " + tuoi + " và cao " + cao + " mét.");

    }
}