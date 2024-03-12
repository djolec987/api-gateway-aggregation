package rs.codecraft.apigatewayaggregation.productservice.core.usecase;

import rs.codecraft.apigatewayaggregation.productservice.core.entity.Product;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ProductUseCase {

    List<Product> getAllProducts();

    Optional<Product> getById(UUID id);

    Product addProduct(Product product);

}
