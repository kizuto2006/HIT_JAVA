import java.util.Scanner;
public class BTVN1
{
    public static double Shv(double canh)
    {
        return canh * canh;
    }

    public static double Stg(double day,double chieuCao)
    {
        return 0.5 * day * chieuCao;
    }

    public static double Sht(double r,double pi)
    {
        return pi * r * r;
    }

    public static void main(String[] args) {
        final String a = "hv";
        final String b = "tg";
        final String c = "ht";
        final double pi = 3.14;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập loại hình( hv , tg , ht ) : ");
        String type = sc.nextLine();
        double s;
        switch (type) {
            case a:
                System.out.print("Nhập cạnh hình vuông: ");
                double canh = sc.nextDouble();
                s = Shv(canh);
                break;
            case b:
                System.out.print("Nhập đáy tam giác: ");
                double day = sc.nextDouble();
                System.out.print("Nhập chiều cao tam giác: ");
                double chieuCao = sc.nextDouble();
                s = Stg(day, chieuCao);
                break;
            case c:
                System.out.print("Nhập bán kính hình tròn: ");
                double r = sc.nextDouble();
                s = Sht(r, pi);
                break;
            default:
                System.out.println("Hình dạng không hợp lệ !");
                return;

        }
        System.out.println("Diện tích viên gạch là : " + s);
    }
}
