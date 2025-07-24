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

    public static void prime(int[] mang,int n)
    {
        int a=0;
        for(int i=0;i <n;i++)
        {
            if(mang[i]>1)
            {
                for(n = 2; n*n < mang[i]; n++)
                {
                    if( mang[i] % n == 0 )
                    {
                        a++;
                    }
                }
                if(a > 2)
                {
                    n--;
                }
            }


        }
        System.out.println("Số lượng các só nguyên tố là : " + n );

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
        prime(mang,n);
    }
}
