package Bai1.dang4;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhập số thứ nhất: ");
            int a = sc.nextInt();
            System.out.println("Nhập số thứ hai: ");
            int b = sc.nextInt();
            System.out.println("Thương của a và b là: " + a/b);
        }catch (ArithmeticException e){
            System.out.println("Không thể chia hết cho 0");
        }catch (Exception e){
            System.out.println("Yêu cầu người dùng nhập lại");
        }
    }
}
