package rs.codecraft.apigatewayaggregation.productservice.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import rs.codecraft.apigatewayaggregation.productservice.adapter.persistance.db.repository.ProductDBRepository;
import rs.codecraft.apigatewayaggregation.productservice.adapter.persistance.mock.repository.ProductMockRepository;
import rs.codecraft.apigatewayaggregation.productservice.adapter.persistance.mongo.repository.ProductMongoRepository;
import rs.codecraft.apigatewayaggregation.productservice.adapter.persistance.mongo.repository.mongo.MongoRepositoryProduct;
import rs.codecraft.apigatewayaggregation.productservice.core.repository.ProductRepository;

@Configuration
public class RepositoryConfig {

    @Bean
    @ConditionalOnProperty(value = "aga.repository.implementation", havingValue = "mongo")
    ProductRepository productRepositoryMongo(MongoRepositoryProduct mongoRepositoryProduct) {
        return ProductMongoRepository.builder()
                .mongoRepositoryProduct(mongoRepositoryProduct)
                .build();
    }

    @Bean
    @ConditionalOnProperty(value = "aga.repository.implementation", havingValue = "mock", matchIfMissing = true)
    ProductRepository productRepositoryMock() {
        return ProductMockRepository.builder().build();
    }

}
