package org.fawry.services;

import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import org.fawry.model.Product;
import org.fawry.repo.ProductMemoryManagementRepo;

import java.util.List;

@Singleton
public class ProductServicesImpl implements ProductServices {
    @Inject
    ProductMemoryManagementRepo productMemoryManagementRepo;
    @Override
    public void save(Product product) {
        productMemoryManagementRepo.save(product);

    }

    @Override
    public List<Product> findAll() {
        return productMemoryManagementRepo.findAll();
    }
}
