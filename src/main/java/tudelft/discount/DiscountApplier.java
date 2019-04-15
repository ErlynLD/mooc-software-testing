package tudelft.discount;

import java.util.List;

public class DiscountApplier {

    private ProductDao dao;

    public DiscountApplier (ProductDao dao) {
        //this.dao = dao;
        //This is my solution. It was copying by reference.
        this.dao = new ProductDao();
        for (Product p: dao.all()){
            this.dao.allProducts.add(new Product(p.getName(), p.getPrice(), p.getCategory()));
        }
    }

    public void setNewPrices() {

        for(Product product : dao.all()) {
            if(product.getCategory().equals("BUSINESS")) {
//                product.setPrice(product.getPrice() * 0.9);
                product.setPrice(product.getPrice() * 1.1);
            }
            if(product.getCategory().equals("HOME")) {
//                product.setPrice(product.getPrice() * 1.1);
                product.setPrice(product.getPrice() * 0.9);
            }
        }

    }

    public ProductDao getProductDaoModified(){
        return dao;
    }
}
