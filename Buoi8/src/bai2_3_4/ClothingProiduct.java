package bai2_3_4;

public class ClothingProiduct extends Product
{

    public ClothingProiduct(String name, double price, int quantity, String category, Manufacturer manufacturer) {
        super(name, price, quantity, category, manufacturer);
    }

    @Override
    public double getDiscountPrice(double price) {
        return price*0.95;
    }
}
