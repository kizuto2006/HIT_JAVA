package Bai_1;

import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số sinh viên: ");
        int n = sc.nextInt();
        Student[] a = new Student[n];
        for (int i = 0; i < n; i++)
        {
            System.out.println("Nhập thông tin sinh viên thứ " + (i+1));
            a[i] = new Student();
            a[i].Input();
        }
        System.out.println("Thông tin các sinh viên: ");
        for(Student aa : a)
        {
            aa.Output();
        }

    }
}