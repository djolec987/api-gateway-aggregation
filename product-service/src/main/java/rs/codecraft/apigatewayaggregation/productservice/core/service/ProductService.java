package rs.codecraft.apigatewayaggregation.productservice.core.service;

import rs.codecraft.apigatewayaggregation.productservice.core.entity.Product;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ProductService {

    List<Product> getAllProducts();

    Optional<Product> getById(UUID id);

}
