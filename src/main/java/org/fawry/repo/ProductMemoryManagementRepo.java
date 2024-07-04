package org.fawry.repo;

import org.fawry.model.Product;

import java.util.List;

public interface ProductMemoryManagementRepo {
    void save(Product product);
    List<Product> findAll();
}
