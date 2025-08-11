package Bai_2;
import java.util.Scanner;

public class May
{
    private String MaMay;
    private String TenMay;
    private String TinhTrang;

    public May(){}

    public May(String maMay, String tenMay, String tinhTrang) {
        MaMay = maMay;
        TenMay = tenMay;
        TinhTrang = tinhTrang;
    }

    public String getMaMay() {
        return MaMay;
    }

    public void setMaMay(String maMay) {
        MaMay = maMay;
    }

    public String getTenMay() {
        return TenMay;
    }

    public void setTenMay(String tenMay) {
        TenMay = tenMay;
    }

    public String getTinhTrang() {
        return TinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        TinhTrang = tinhTrang;
    }

    public void Nhap()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã máy: ");
        MaMay = sc.nextLine();
        System.out.println("Nhập tên máy: ");
        TenMay = sc.nextLine();
        System.out.println("Nhập tình trạng của máy");
        TinhTrang = sc.nextLine();
    }
     public void Xuat()
     {
         System.out.println("Mã máy: " + MaMay);
         System.out.println("Tên máy: " + TenMay);
         System.out.println("Tình trạng: " + TinhTrang);
     }
}
