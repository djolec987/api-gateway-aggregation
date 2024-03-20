package rs.codecraft.apigatewayaggregation.productservice.core.usecase.impl;

import lombok.Builder;
import rs.codecraft.apigatewayaggregation.productservice.core.entity.Product;
import rs.codecraft.apigatewayaggregation.productservice.core.service.MessagingService;
import rs.codecraft.apigatewayaggregation.productservice.core.service.ProductService;
import rs.codecraft.apigatewayaggregation.productservice.core.usecase.ProductUseCase;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Builder
public class ProductUseCaseImpl implements ProductUseCase {

    private final ProductService productService;
    private final MessagingService messagingService;

    @Override
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @Override
    public Optional<Product> getById(UUID id) {
        return productService.getById(id);
    }

    @Override
    public Product addProduct(Product product) {
        Product newProduct = productService.addProduct(product);
        messagingService.sendProductAddedMessage(newProduct);
        return newProduct;
    }
}
