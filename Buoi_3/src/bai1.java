import java.util.Scanner;
public class bai1 {
    public static void tong(int[] mang, int n )
    {
        int sumC = 0,sumL = 0;
        for(int i= 0;i < n;i++)
        {
            if(mang[i]%2==0)
            {
                sumC += mang[i];
            }
            else
            {
                sumL += mang[i];
            }
        }

        System.out.println("Tổng các số chẵn là : " + sumC );
        System.out.println("Tổng các số lẻ là : " + sumL );
    }

    public static boolean prime(int n)
    {
        if(n<2)
        {
            return false;
        }
        for(int i = 2;i*i <= n;i++)
        {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void demso(int[] mang,int n)
    {
        int snt = 0;
        for(int i = 0;i < n;i++)
        {
            if (prime(mang[i])) {
                snt++;
            }
        }
        System.out.println("Số các số nguyên tố là : " + snt);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử : ");
        int n = sc.nextInt();
        int[] mang = new int[n];
        for(int i = 0;i < n;i++)
        {
            System.out.print("Số " + (i+1) + " : " );
            mang[i] = sc.nextInt();
        }
        tong(mang,n);
        demso(mang,n);
                    }
}
