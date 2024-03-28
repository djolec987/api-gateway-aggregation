package rs.codecraft.apigatewayaggregation.productservice.adapter.persistance.mongo.mapper;

import org.mapstruct.*;
import org.mapstruct.factory.Mappers;
import rs.codecraft.apigatewayaggregation.productservice.adapter.persistance.mongo.dto.BookDtoMongo;
import rs.codecraft.apigatewayaggregation.productservice.core.entity.Book;
import rs.codecraft.apigatewayaggregation.productservice.core.entity.value.Category;

import java.util.List;

@Mapper
public interface BookMapperMongo {

    BookMapperMongo INSTANCE = Mappers.getMapper(BookMapperMongo.class);

    Book simpleBookDtoMongoToBook(BookDtoMongo bookDtoMongo);

    @Named(value = "bookDtoMongoToBook")
    default Book bookDtoMongoToBook(BookDtoMongo bookDtoMongo) {
        Book book = INSTANCE.simpleBookDtoMongoToBook(bookDtoMongo);
        book.setCategory(Category.BOOK);
        return book;
    }

    BookDtoMongo bookToBookDtoMongo(Book book);

    @IterableMapping(qualifiedByName = "bookDtoMongoToBook")
    List<Book> bookDtoMongoListToBookList(List<BookDtoMongo> bookDtoMongoList);

    List<BookDtoMongo> bookListToBookDtoMongoList(List<Book> bookList);

}
