import java.util.Scanner;

public class bai4
{
    public static void main(String[] args)
    {
        int i;
        int[] mang = new int[5];
        Scanner sc = new Scanner(System.in);
        for(i=0;i<5;i++)
        {
            System.out.print("Nhập số vào mang[" + (i + 1) + "] = ");
            mang[i] = sc.nextInt();
        }
        int tong = 0;

        System.out.print("Các số trong bẳng là : ");
        for(i=0;i<5;i++)
        {
            System.out.print( mang[i] + " " );
            tong += mang[i];
        }
        System.out.println("");
        int max = 0;
        for(i=0;i<5;i++)
        {
            if(max < mang[i])
            {
                max = mang[i];
            }
        }

        System.out.println("Tổng các số trong mảng là : " + tong );
        System.out.println("Số lớn nhất trong mảng là : " + max );

    }

}
