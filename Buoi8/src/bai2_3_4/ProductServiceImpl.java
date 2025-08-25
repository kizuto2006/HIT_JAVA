package bai2_3_4;
import java.util.ArrayList;
public class ProductServiceImpl implements ProductService
{
    ArrayList<Product> products;

    @Override
    public void addProduct(Product p) {

    }

    @Override
    public void updateProduct(String id, Product newInfo) {

    }

    @Override
    public void deleteProduct(String id) {

    }

    @Override
    public Product findByName(String name) {
        return null;
    }

    @Override
    public void sortByPriceAsc() {

    }

    @Override
    public void sortByPriceDesc() {

    }

    @Override
    public void printProducts(Product product) {
        System.out.println(product.manufacturer.getId() + product.getName() + product.getCategory() + product.manufacturer.getName() + product.getQuantity() + product.getPrice() + product.getDiscountPrice());
    }
}
