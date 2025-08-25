package bai1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi ký tự: ");
        String chuoi = sc.nextLine();
        char[] newchuoi = chuoi.toCharArray();
        System.out.println(newchuoi);
        char[] temp = newchuoi;
        int n = newchuoi.length;
        for(int i = 0;i<n;i++)
        {
            temp[i] = newchuoi[n-i-1];
        }
        System.out.println(temp);
    }
}