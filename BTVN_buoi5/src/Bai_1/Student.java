package Bai_1;
import java.util.Scanner;
public class Student
{
    private String Name;
    private String Lop;
    private double Score;
    private Faculty y;

    public Student(){}
    public Student(String name, String lop, double score, Faculty y) {
        Name = name;
        Lop = lop;
        Score = score;
        this.y = y;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getLop() {
        return Lop;
    }

    public void setLop(String lop) {
        Lop = lop;
    }

    public double getScore() {
        return Score;
    }

    public void setScore(double score) {
        Score = score;
    }

    public Faculty getY() {
        return y;
    }

    public void setY(Faculty y) {
        this.y = y;
    }

    public void Input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên sinh viên: ");
        Name = sc.nextLine();
        System.out.println("Nhập lớp: ");
        Lop = sc.nextLine();
        System.out.println("Nhập số điểm: ");
        Score = sc.nextDouble();
        y.Input();
    }

    public void Output()
    {
        System.out.println("Tên sinh viên: " + Name);
        System.out.println("Lớp: " + Lop);
        System.out.println("Điểm số: " + Score);
        y.Output();
    }
}
