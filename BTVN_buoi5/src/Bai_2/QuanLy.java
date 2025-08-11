package Bai_2;
import java.util.Scanner;

public class QuanLy
{
    private String MaQL;
    private String HoTen;

    public QuanLy(String maQL, String hoTen) {
        MaQL = maQL;
        HoTen = hoTen;
    }

    public String getMaQL() {
        return MaQL;
    }

    public void setMaQL(String maQL) {
        MaQL = maQL;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String hoTen) {
        HoTen = hoTen;
    }

    public void Nhap()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã quản lý: ");
        MaQL = sc.nextLine();
        System.out.println("Nhập họ tên quản lý: ");
        HoTen = sc.nextLine();
    }

    public void Xuat()
    {
        System.out.println("Mã QL: " + MaQL);
        System.out.println("Họ và tên: " + HoTen);
    }
}
