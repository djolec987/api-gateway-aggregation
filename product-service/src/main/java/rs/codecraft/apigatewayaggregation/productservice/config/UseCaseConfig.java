package rs.codecraft.apigatewayaggregation.productservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import rs.codecraft.apigatewayaggregation.productservice.core.service.MessagingService;
import rs.codecraft.apigatewayaggregation.productservice.core.service.ProductService;
import rs.codecraft.apigatewayaggregation.productservice.core.service.impl.ProductServiceImpl;
import rs.codecraft.apigatewayaggregation.productservice.core.usecase.ProductUseCase;
import rs.codecraft.apigatewayaggregation.productservice.core.usecase.impl.ProductUseCaseImpl;

@Configuration
public class UseCaseConfig {

    @Bean
    ProductUseCase productUseCase(ProductService productServicece, MessagingService messagingService) {
        return ProductUseCaseImpl.builder()
                .productService(productServicece)
                .messagingService(messagingService)
                .build();
    }

}
