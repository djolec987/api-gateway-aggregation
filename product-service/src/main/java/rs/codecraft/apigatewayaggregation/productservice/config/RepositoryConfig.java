package rs.codecraft.apigatewayaggregation.productservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import rs.codecraft.apigatewayaggregation.productservice.adapter.persistance.db.repository.ProductDBRepository;
import rs.codecraft.apigatewayaggregation.productservice.adapter.persistance.mock.repository.ProductMockRepository;
import rs.codecraft.apigatewayaggregation.productservice.core.repository.ProductRepository;

@Configuration
public class RepositoryConfig {

    @Bean
    ProductRepository productRepository() {
        return ProductMockRepository.builder().build();
    }

}
