package rs.codecraft.apigatewayaggregation.productservice.adapter.persistance.db.repository;

import lombok.Builder;
import rs.codecraft.apigatewayaggregation.productservice.core.entity.Product;
import rs.codecraft.apigatewayaggregation.productservice.core.repository.ProductRepository;

import java.util.List;

@Builder
public class ProductDBRepository implements ProductRepository {

    @Override
    public List<Product> getAllProducts() {
        throw new RuntimeException("Not yet implemented");
    }
}
