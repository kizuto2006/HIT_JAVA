import java.util.Scanner;
public class buoi3 {
    static final double PI = 3.14159265 ;
    public static double tinhC(double r) {
        return  2 * PI * r;
    }
    public static double tinhS(double r) {
        return PI * r * r;
    }
    public static void hienThi( double C , double S , double r , int k ) {
        System.out.println("Chu vi của hình tròn là : " + C);
        System.out.println("Diện tích của hình tròn là : " + S);
        System.out.println("Lũy thừa của r mũ k là : " + Math.pow(r, k));
        System.out.println("Căn bậc 2 của ( r + k ) là : " + Math.sqrt(r + k));
        System.out.println("Giá trị tuyệt đối của ( r - k ) là : " + Math.abs(r - k));
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập bán kính : ");
        double r = sc.nextDouble();
        System.out.print("Nhập số k : ");
        int k = sc.nextInt();
        double C = tinhC( r );
        double S = tinhS( r );
        hienThi( C,S,r,k );
    }
}
