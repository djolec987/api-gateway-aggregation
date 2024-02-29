package rs.codecraft.apigatewayaggregation.productservice.core.usecase.impl;

import lombok.Builder;
import rs.codecraft.apigatewayaggregation.productservice.core.entity.Product;
import rs.codecraft.apigatewayaggregation.productservice.core.service.ProductService;
import rs.codecraft.apigatewayaggregation.productservice.core.usecase.ProductUseCase;

import java.util.List;

@Builder
public class ProductUseCaseImpl implements ProductUseCase {

    private final ProductService productService;

    @Override
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }
}
