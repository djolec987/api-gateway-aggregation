package rs.codecraft.apigatewayaggregation.productservice.core.usecase;

import rs.codecraft.apigatewayaggregation.productservice.core.entity.Product;

import java.util.List;

public interface ProductUseCase {

    List<Product> getAllProducts();

}
