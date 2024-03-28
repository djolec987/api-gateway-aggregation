package rs.codecraft.apigatewayaggregation.productservice.core.usecase.impl;

import lombok.Builder;
import rs.codecraft.apigatewayaggregation.productservice.core.entity.Book;
import rs.codecraft.apigatewayaggregation.productservice.core.service.BookService;
import rs.codecraft.apigatewayaggregation.productservice.core.service.MessagingService;
import rs.codecraft.apigatewayaggregation.productservice.core.usecase.BookUseCase;

@Builder
public class BookUseCaseImpl implements BookUseCase {

    private final BookService bookService;
    private final MessagingService messagingService;

    @Override
    public Book addBook(Book book) {
        Book newBook = bookService.addBook(book);
        messagingService.sendProductAddedMessage(newBook);
        return newBook;
    }
}
