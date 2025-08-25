import java.util.Scanner;
public class bai3
{
    public static String taochuoi(String str)
    {
        String str_trim = str.trim();
        int dodai = str_trim.length();
        String str2 ="" ;
        for (int i = dodai - 1; i >= 0 ; i--)
        {
            str2 += str.charAt(i);
        }
        return str2;
    }

    public static void check(String str,String str2)
    {
        if(str.equalsIgnoreCase(str2))
        {
            System.out.println("Đây là chuỗi đối xứng");
        }
        else
        {
            System.out.println("Đây không là chuỗi đối xứng");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi : ");
        String str = sc.nextLine();
        taochuoi(str);
        String ngc = taochuoi(str);
        check(str,ngc);
    }
}
