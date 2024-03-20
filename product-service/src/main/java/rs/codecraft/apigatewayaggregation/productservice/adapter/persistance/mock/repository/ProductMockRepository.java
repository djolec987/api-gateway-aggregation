package rs.codecraft.apigatewayaggregation.productservice.adapter.persistance.mock.repository;

import jakarta.annotation.PostConstruct;
import lombok.Builder;
import rs.codecraft.apigatewayaggregation.productservice.adapter.persistance.mock.dto.ProductDtoMock;
import rs.codecraft.apigatewayaggregation.productservice.adapter.persistance.mock.mapper.ProductMapperMock;
import rs.codecraft.apigatewayaggregation.productservice.core.entity.Product;
import rs.codecraft.apigatewayaggregation.productservice.core.repository.ProductRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Builder
public class ProductMockRepository implements ProductRepository {

    private List<ProductDtoMock> allProducts;

    @PostConstruct
    public void initialize() {
        this.allProducts = new ArrayList<>();
        this.allProducts.addAll(
                List.of(
                        new ProductDtoMock(UUID.fromString("9f5ebb7f-5175-44fb-be40-0fb9981833cc"), "Mouse"),
                        new ProductDtoMock(UUID.fromString("358f07e7-f2c9-4b64-ab87-51e4b80f1d7e"), "Keyboard")
                ));
    }

    @Override
    public List<Product> getAllProducts() {
        return ProductMapperMock.INSTANCE.productDtoMockListToProductList(allProducts);
    }

    @Override
    public Optional<Product> getById(UUID id) {
        return allProducts.stream()
                .filter(p -> p.getId().equals(id))
                .map(p -> ProductMapperMock.INSTANCE.productDtoMockToProduct(p))
                .findFirst();
    }

}
