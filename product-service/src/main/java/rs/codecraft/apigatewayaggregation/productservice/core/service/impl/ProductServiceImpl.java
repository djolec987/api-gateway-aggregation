package rs.codecraft.apigatewayaggregation.productservice.core.service.impl;

import lombok.Builder;
import rs.codecraft.apigatewayaggregation.productservice.core.entity.Product;
import rs.codecraft.apigatewayaggregation.productservice.core.repository.ProductRepository;
import rs.codecraft.apigatewayaggregation.productservice.core.service.ProductService;

import java.util.List;

@Builder
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Override
    public List<Product> getAllProducts() {
        return productRepository.getAllProducts();
    }
}
