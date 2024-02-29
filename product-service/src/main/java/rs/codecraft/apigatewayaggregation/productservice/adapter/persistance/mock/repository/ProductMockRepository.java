package rs.codecraft.apigatewayaggregation.productservice.adapter.persistance.mock.repository;

import lombok.Builder;
import rs.codecraft.apigatewayaggregation.productservice.core.entity.Product;
import rs.codecraft.apigatewayaggregation.productservice.core.repository.ProductRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Builder
public class ProductMockRepository implements ProductRepository {

    private List<Product> allProducts = new ArrayList<>(List.of(new Product(UUID.randomUUID(), "Mouse"), new Product(UUID.randomUUID(), "Keyboard")));

    @Override
    public List<Product> getAllProducts() {
        return allProducts;
    }
}
