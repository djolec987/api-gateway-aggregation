package rs.codecraft.apigatewayaggregation.productservice.adapter.persistance.db.repository;

import lombok.Builder;
import rs.codecraft.apigatewayaggregation.productservice.core.entity.Product;
import rs.codecraft.apigatewayaggregation.productservice.core.repository.ProductRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Builder
public class ProductDBRepository implements ProductRepository {

    @Override
    public List<Product> getAllProducts() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public Optional<Product> getById(UUID id) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

}
