package rs.codecraft.apigatewayaggregation.productservice.core.service;

import rs.codecraft.apigatewayaggregation.productservice.core.entity.Product;

import java.util.List;

public interface ProductService {

    List<Product> getAllProducts();

}
