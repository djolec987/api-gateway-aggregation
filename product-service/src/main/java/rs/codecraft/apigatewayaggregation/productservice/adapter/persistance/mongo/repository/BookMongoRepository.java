package rs.codecraft.apigatewayaggregation.productservice.adapter.persistance.mongo.repository;

import lombok.Builder;
import rs.codecraft.apigatewayaggregation.productservice.adapter.persistance.mongo.dto.BookDtoMongo;
import rs.codecraft.apigatewayaggregation.productservice.adapter.persistance.mongo.mapper.BookMapperMongo;
import rs.codecraft.apigatewayaggregation.productservice.adapter.persistance.mongo.repository.mongo.MongoRepositoryBook;
import rs.codecraft.apigatewayaggregation.productservice.core.entity.Book;
import rs.codecraft.apigatewayaggregation.productservice.core.repository.BookRepository;

import java.util.UUID;

@Builder
public class BookMongoRepository implements BookRepository {

    private final MongoRepositoryBook mongoRepositoryBook;

    @Override
    public Book addBook(Book book) {
        BookDtoMongo bookDtoMongo = BookMapperMongo.INSTANCE.bookToBookDtoMongo(book);
        bookDtoMongo.setId(UUID.randomUUID());
        return BookMapperMongo.INSTANCE.bookDtoMongoToBook(
                mongoRepositoryBook.insert(bookDtoMongo)
        );
    }
}
