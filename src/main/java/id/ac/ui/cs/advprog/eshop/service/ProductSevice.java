package id.ac.ui.cs.advprog.eshop.service;

import id.ac.ui.cs.advprog.eshop.model.Product;
import java.util.List;

public interface ProductSevice {
    public  Product create(Product product);
    public List<Product> findtAll();
}
