package rs.codecraft.apigatewayaggregation.productservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import rs.codecraft.apigatewayaggregation.productservice.core.service.AuthorService;
import rs.codecraft.apigatewayaggregation.productservice.core.service.BookService;
import rs.codecraft.apigatewayaggregation.productservice.core.service.MessagingService;
import rs.codecraft.apigatewayaggregation.productservice.core.service.ProductService;
import rs.codecraft.apigatewayaggregation.productservice.core.service.impl.ProductServiceImpl;
import rs.codecraft.apigatewayaggregation.productservice.core.usecase.AuthorUseCase;
import rs.codecraft.apigatewayaggregation.productservice.core.usecase.BookUseCase;
import rs.codecraft.apigatewayaggregation.productservice.core.usecase.ProductUseCase;
import rs.codecraft.apigatewayaggregation.productservice.core.usecase.impl.AuthorUseCaseImpl;
import rs.codecraft.apigatewayaggregation.productservice.core.usecase.impl.BookUseCaseImpl;
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

    @Bean
    AuthorUseCase authorUseCase(AuthorService authorService) {
        return AuthorUseCaseImpl.builder()
                .authorService(authorService)
                .build();
    }

    @Bean
    BookUseCase bookUseCase(BookService bookService, MessagingService messagingService) {
        return BookUseCaseImpl.builder()
                .bookService(bookService)
                .messagingService(messagingService)
                .build();
    }

}
