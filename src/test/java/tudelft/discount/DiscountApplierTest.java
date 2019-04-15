package tudelft.discount;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class DiscountApplierTest {

    @Test
    public void discountApplierMockTest(){
        ProductDao mock = new ProductDao();
        List<Product> allProducts = mock.all();

        DiscountApplier discountApplier = new DiscountApplier(mock);
        discountApplier.setNewPrices();

        List<Product> allProductsNewPrices = discountApplier.getProductDaoModified().all();

        DecimalFormat ds = new DecimalFormat(".#");
        for (int i = 0; i < allProducts.size(); i++) {
            if (allProducts.get(i).getCategory().equals("HOME")){
                Assertions.assertEquals(
                        ds.format(allProducts.get(i).getPrice() * 0.9),
                        ds.format(allProductsNewPrices.get(i).getPrice())
                );
            }else if (allProducts.get(i).getCategory().equals("BUSINESS")) {
                Assertions.assertEquals(
                        ds.format(allProducts.get(i).getPrice() * 1.1),
                        ds.format(allProductsNewPrices.get(i).getPrice())
                );
            }
            System.out.println("Orignal: " + allProducts.get(i).getPrice() + " - New: " + allProductsNewPrices.get(i).getPrice());
        }
    }
}
