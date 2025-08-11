package Bai_1;
import java.util.Scanner;

public class Faculty
{
    private String Name;
    private String Date;
    private School x;

    public Faculty(){}
    public Faculty(String name, String date, School x) {
        Name = name;
        Date = date;
        this.x = x;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public School getSchool() {
        return x;
    }

    public void setSchool(School school) {
        this.x = school;
    }

    //Các phương thức

    public void Input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên khoa: ");
        Name = sc.nextLine();
        System.out.println("Nhập ngày vào khoa: ");
        Date = sc.nextLine();
        //
        System.out.println("Nhập tên trường: ");
        String ten = sc.nextLine();
        x.setName(ten);
        System.out.println("Nhập ngày vào trường: ");
        String ngay = sc.nextLine();
        x.setDate(ngay);
    }

    public void Output()
    {
        System.out.println("Tên khoa: " + Name);
        System.out.println("Ngày vào khoa: " + Date);
        System.out.println("Tên trường: " + x.getName());
        System.out.println("Ngày vào trường: " + x.getDate());
    }

}
