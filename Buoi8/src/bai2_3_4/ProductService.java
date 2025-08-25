package bai2_3_4;

public interface ProductService {
    public void addProduct(Product p);
    public void updateProduct(String id,Product newInfo);
    public void deleteProduct(String id);
    public Product findByName(String name);
    public void sortByPriceAsc();
    public void sortByPriceDesc();
    public void printProducts(Product product);
}
