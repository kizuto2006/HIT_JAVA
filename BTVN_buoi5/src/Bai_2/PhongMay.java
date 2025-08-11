package Bai_2;

import java.util.Scanner;

public class PhongMay
{
    private String MaPhong;
    private String TenPhong;
    private double DienTich;
    private int n;
    private QuanLy x;
    May[] y = new May[n];

    public PhongMay(){}

    public PhongMay(String maPhong, String tenPhong, int n, double dienTich, QuanLy x, May[] y) {
        MaPhong = maPhong;
        TenPhong = tenPhong;
        this.n = n;
        DienTich = dienTich;
        this.x = x;
        this.y = y;
    }

    public String getMaPhong() {
        return MaPhong;
    }

    public void setMaPhong(String maPhong) {
        MaPhong = maPhong;
    }

    public String getTenPhong() {
        return TenPhong;
    }

    public void setTenPhong(String tenPhong) {
        TenPhong = tenPhong;
    }

    public double getDienTich() {
        return DienTich;
    }

    public void setDienTich(double dienTich) {
        DienTich = dienTich;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public QuanLy getX() {
        return x;
    }

    public void setX(QuanLy x) {
        this.x = x;
    }

    public May[] getY() {
        return y;
    }

    public void setY(May[] y) {
        this.y = y;
    }

    public void Nhap()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã phòng: ");
        MaPhong = sc.nextLine();
        System.out.println("Nhập tên phòng: ");
        TenPhong = sc.nextLine();
        System.out.println("Nhập diện tích: ");
        DienTich = sc.nextDouble();
        x.Nhap();
        System.out.println("Nhập số máy: ");
        n = sc.nextInt();
        for(int i = 0;i < n;i ++)
        {
            System.out.println("-Nhập máy thứ " + (i+1));
            y[i].Nhap();
        }
    }

    public void Xuat()
    {
        System.out.println("Mã phòng: " + MaPhong);
        System.out.println("Tên phòng: " + TenPhong);
        System.out.println("Diện tích: " + DienTich);
        x.Xuat();
        for(int i = 0;i < n;i ++)
        {
            System.out.println("-Máy " + (i + 1));
            y[i].Xuat();
        }
    }
}
