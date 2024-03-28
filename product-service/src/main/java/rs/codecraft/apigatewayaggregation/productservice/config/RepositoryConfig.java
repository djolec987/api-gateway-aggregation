package rs.codecraft.apigatewayaggregation.productservice.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import rs.codecraft.apigatewayaggregation.productservice.adapter.persistance.db.repository.ProductDBRepository;
import rs.codecraft.apigatewayaggregation.productservice.adapter.persistance.mock.repository.ProductMockRepository;
import rs.codecraft.apigatewayaggregation.productservice.adapter.persistance.mongo.repository.AuthorMongoRepository;
import rs.codecraft.apigatewayaggregation.productservice.adapter.persistance.mongo.repository.BookMongoRepository;
import rs.codecraft.apigatewayaggregation.productservice.adapter.persistance.mongo.repository.ProductMongoRepository;
import rs.codecraft.apigatewayaggregation.productservice.adapter.persistance.mongo.repository.mongo.MongoRepositoryAuthor;
import rs.codecraft.apigatewayaggregation.productservice.adapter.persistance.mongo.repository.mongo.MongoRepositoryBook;
import rs.codecraft.apigatewayaggregation.productservice.adapter.persistance.mongo.repository.mongo.MongoRepositoryProduct;
import rs.codecraft.apigatewayaggregation.productservice.core.repository.AuthorRepository;
import rs.codecraft.apigatewayaggregation.productservice.core.repository.BookRepository;
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

    @Bean
    @ConditionalOnProperty(value = "aga.repository.implementation", havingValue = "mongo")
    AuthorRepository authorRepository(MongoRepositoryAuthor mongoRepositoryAuthor) {
        return AuthorMongoRepository.builder()
                .mongoRepositoryAuthor(mongoRepositoryAuthor)
                .build();
    }

    @Bean
    BookRepository bookRepository(MongoRepositoryBook mongoRepositoryBook) {
        return BookMongoRepository.builder()
                .mongoRepositoryBook(mongoRepositoryBook)
                .build();
    }

}
