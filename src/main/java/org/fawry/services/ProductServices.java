package org.fawry.services;

import org.fawry.model.Product;

import java.util.List;

public interface ProductServices {
    void save(Product product);
    List<Product> findAll();
}
