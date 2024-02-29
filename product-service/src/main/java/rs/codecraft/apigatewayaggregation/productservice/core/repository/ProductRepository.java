package rs.codecraft.apigatewayaggregation.productservice.core.repository;

import rs.codecraft.apigatewayaggregation.productservice.core.entity.Product;

import java.util.List;

public interface ProductRepository {

    List<Product> getAllProducts();

}
