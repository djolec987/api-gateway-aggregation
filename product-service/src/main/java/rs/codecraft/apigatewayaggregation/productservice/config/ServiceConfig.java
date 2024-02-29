package rs.codecraft.apigatewayaggregation.productservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import rs.codecraft.apigatewayaggregation.productservice.core.repository.ProductRepository;
import rs.codecraft.apigatewayaggregation.productservice.core.service.ProductService;
import rs.codecraft.apigatewayaggregation.productservice.core.service.impl.ProductServiceImpl;

@Configuration
public class ServiceConfig {

    @Bean
    ProductService productService(ProductRepository productRepository) {
        return ProductServiceImpl.builder()
                .productRepository(productRepository)
                .build();
    }

}
