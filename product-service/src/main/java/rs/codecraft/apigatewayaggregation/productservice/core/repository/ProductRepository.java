package rs.codecraft.apigatewayaggregation.productservice.core.repository;

import rs.codecraft.apigatewayaggregation.productservice.core.entity.Product;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ProductRepository {

    List<Product> getAllProducts();

    Optional<Product> getById(UUID id);

    default Optional<Product> getByName(String name) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    default Product addProduct(Product product) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

}
