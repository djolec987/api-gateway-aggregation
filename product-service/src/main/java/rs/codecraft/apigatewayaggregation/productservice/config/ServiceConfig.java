package rs.codecraft.apigatewayaggregation.productservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import rs.codecraft.apigatewayaggregation.productservice.core.repository.AuthorRepository;
import rs.codecraft.apigatewayaggregation.productservice.core.repository.BookRepository;
import rs.codecraft.apigatewayaggregation.productservice.core.repository.ProductRepository;
import rs.codecraft.apigatewayaggregation.productservice.core.service.AuthorService;
import rs.codecraft.apigatewayaggregation.productservice.core.service.BookService;
import rs.codecraft.apigatewayaggregation.productservice.core.service.ProductService;
import rs.codecraft.apigatewayaggregation.productservice.core.service.impl.AuthorServiceImpl;
import rs.codecraft.apigatewayaggregation.productservice.core.service.impl.BookServiceImpl;
import rs.codecraft.apigatewayaggregation.productservice.core.service.impl.ProductServiceImpl;

@Configuration
public class ServiceConfig {

    @Bean
    ProductService productService(ProductRepository productRepository) {
        return ProductServiceImpl.builder()
                .productRepository(productRepository)
                .build();
    }

    @Bean
    AuthorService authorService(AuthorRepository authorRepository) {
        return AuthorServiceImpl.builder()
                .authorRepository(authorRepository)
                .build();
    }

    @Bean
    BookService bookService(BookRepository bookRepository) {
        return BookServiceImpl.builder()
                .bookRepository(bookRepository)
                .build();
    }

}
