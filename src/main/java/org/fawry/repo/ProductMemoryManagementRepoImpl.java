package org.fawry.repo;

import jakarta.inject.Singleton;
import org.fawry.model.Product;

import java.util.ArrayList;
import java.util.List;

@Singleton
public class ProductMemoryManagementRepoImpl implements ProductMemoryManagementRepo {
    List<Product> products=new ArrayList<>();
    @Override
    public void save(Product product) {
        product.setId(products.size());
        products.add(product);
    }

    @Override
    public List<Product> findAll() {
        return products;
    }
}
