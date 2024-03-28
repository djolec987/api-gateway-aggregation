package rs.codecraft.apigatewayaggregation.productservice.core.service.impl;

import lombok.Builder;
import rs.codecraft.apigatewayaggregation.productservice.core.entity.Book;
import rs.codecraft.apigatewayaggregation.productservice.core.repository.BookRepository;
import rs.codecraft.apigatewayaggregation.productservice.core.service.BookService;

@Builder
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    @Override
    public Book addBook(Book book) {
        return bookRepository.addBook(book);
    }
}
