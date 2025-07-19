import java.text.DecimalFormat;
import java.util.Scanner;
public class tt1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập bán kính r = ");
        float r = sc.nextFloat();
        if( r > 0 && r < 1000 )
        {
            float pi = 3.14F;
            float S = pi*r*r;
            float C = 2*pi*r;
            DecimalFormat fix = new DecimalFormat("#.000");
            String s = fix.format(S);
            String c = fix.format(C);
            System.out.print(c + " " + s);
        }
    }
}
