package rs.codecraft.apigatewayaggregation.productservice.core.usecase.impl;

import lombok.Builder;
import rs.codecraft.apigatewayaggregation.productservice.core.entity.Product;
import rs.codecraft.apigatewayaggregation.productservice.core.service.ProductService;
import rs.codecraft.apigatewayaggregation.productservice.core.usecase.ProductUseCase;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Builder
public class ProductUseCaseImpl implements ProductUseCase {

    private final ProductService productService;

    @Override
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @Override
    public Optional<Product> getById(UUID id) {
        return productService.getById(id);
    }
}
