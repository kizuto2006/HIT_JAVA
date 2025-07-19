public class bai5
{
    public static void main(String[] args)
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println("5 x " + i + " = " + 5*i );
        }
        int l = 0;
        int tong = 0;
        while(l<100)
        {
            if(l%2==0)
            {
                tong += l;
            }
            l++;
        }
        System.out.println("Tổng các số chẵn từ 1 đến 100 là : " + tong);
    }
}
