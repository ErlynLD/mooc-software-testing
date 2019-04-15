package tudelft.discount;

import java.util.ArrayList;
import java.util.List;

//public interface ProductDao {
//    List<Product> all();
//}

public class ProductDao{
    List<Product> allProducts;

    public ProductDao(){
        allProducts = new ArrayList<Product> ();
        allProducts.add(new Product("Eggs", 100.00, "HOME"));
        allProducts.add(new Product("Pen Box", 100.00, "BUSINESS"));
        allProducts.add(new Product("Apple", 200.00, "HOME"));
        allProducts.add(new Product("Sheets", 500.00, "BUSINESS"));
        allProducts.add(new Product("Water", 45.00, "HOME"));
    }

    List<Product> all(){
        return allProducts;
    }
}