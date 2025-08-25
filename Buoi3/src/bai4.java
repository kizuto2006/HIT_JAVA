import java.util.Scanner;
public class bai4
{
    public static int fibonacci(int n)
    {
        if( n == 0 ) { return 0; }
        if( n == 1 ) { return 1; }
        int F = 1 , a = 0 , b = 1;
        for ( int i = 2 ; i <= n ; i ++)
        {
            F = a + b;
            a = b;
            b = F;
        }
        return F;
    }



    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số n : ");
        int n = sc.nextInt();
        int tongLe =0;
        System.out.println("Dãy fibonacci từ 0 đến " + n + " là : ");
        for( int i = 0 ; i <= n ; i ++ )
        {
            int fibo = fibonacci(i);
            System.out.print(fibo + " ");
            if(fibo%2==1)
            {
                tongLe += fibo;
            }
        }
        System.out.println("Tổng lẻ là : " + tongLe );


    }

}
