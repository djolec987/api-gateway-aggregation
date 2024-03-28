package rs.codecraft.apigatewayaggregation.productservice.adapter.api.rest.mapper;

import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;
import rs.codecraft.apigatewayaggregation.productservice.adapter.api.rest.dto.BookDtoRest;
import rs.codecraft.apigatewayaggregation.productservice.core.entity.Book;
import rs.codecraft.apigatewayaggregation.productservice.core.entity.value.Category;

import java.util.List;

@Mapper
public interface BookMapperRest {

    BookMapperRest INSTANCE = Mappers.getMapper(BookMapperRest.class);

    Book simpleBookDtoRestToBook(BookDtoRest bookDtoRest);

    @Named(value = "bookDtoRestToBook")
    default Book bookDtoRestToBook(BookDtoRest bookDtoRest) {
        Book book = simpleBookDtoRestToBook(bookDtoRest);
        book.setCategory(Category.BOOK);
        return book;
    }

    BookDtoRest bookToBookDtoRest(Book book);

    @IterableMapping(qualifiedByName = "bookDtoRestToBook")
    List<Book> bookDtoRestListToBookList(List<BookDtoRest> bookDtoRestList);

    List<BookDtoRest> bookListToBookDtoRestList(List<Book> bookList);

}
