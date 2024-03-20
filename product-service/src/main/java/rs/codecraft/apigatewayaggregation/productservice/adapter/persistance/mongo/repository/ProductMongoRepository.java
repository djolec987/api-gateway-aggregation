package rs.codecraft.apigatewayaggregation.productservice.adapter.persistance.mongo.repository;

import lombok.Builder;
import rs.codecraft.apigatewayaggregation.productservice.adapter.persistance.mongo.dto.ProductDtoMongo;
import rs.codecraft.apigatewayaggregation.productservice.adapter.persistance.mongo.mapper.ProductMapperMongo;
import rs.codecraft.apigatewayaggregation.productservice.adapter.persistance.mongo.repository.mongo.MongoRepositoryProduct;
import rs.codecraft.apigatewayaggregation.productservice.core.entity.Product;
import rs.codecraft.apigatewayaggregation.productservice.core.repository.ProductRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Builder
public class ProductMongoRepository implements ProductRepository {

    private final MongoRepositoryProduct mongoRepositoryProduct;

    @Override
    public List<Product> getAllProducts() {
        return ProductMapperMongo.INSTANCE.productDtoMongoListToProductList(mongoRepositoryProduct.findAll());
    }

    @Override
    public Optional<Product> getById(UUID id) {
        return Optional.of(
                ProductMapperMongo.INSTANCE.productDtoMongoToProduct(
                        mongoRepositoryProduct.findById(id).orElse(null)
                ));
    }

    @Override
    public Product addProduct(Product product) {
        ProductDtoMongo mappedProduct = ProductMapperMongo.INSTANCE.productToProductDtoMongo(product);
        mappedProduct.setId(UUID.randomUUID());
        ProductDtoMongo createdProduct = mongoRepositoryProduct.insert(mappedProduct);
        return ProductMapperMongo.INSTANCE.productDtoMongoToProduct(createdProduct);
    }

    @Override
    public Optional<Product> getByName(String name) {
        return Optional.of(
                ProductMapperMongo.INSTANCE.productDtoMongoToProduct(
                        mongoRepositoryProduct.findByName(name).orElse(null)
        ));
    }
}
