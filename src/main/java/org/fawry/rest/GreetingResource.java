package org.fawry.rest;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.fawry.model.Product;
import org.fawry.services.ProductServices;

import java.util.List;

@Path("/product")
public class GreetingResource {
    @Inject
    ProductServices productServices ;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Product> getAllProducts() {

        return productServices.findAll() ;
    }
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Product addProduct(Product product) {
        productServices.save(product);
        return product; // Optionally return the saved product
    }


}
