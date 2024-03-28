package rs.codecraft.apigatewayaggregation.productservice.adapter.api.rest.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rs.codecraft.apigatewayaggregation.productservice.adapter.api.rest.dto.BookDtoRest;
import rs.codecraft.apigatewayaggregation.productservice.adapter.api.rest.mapper.BookMapperRest;
import rs.codecraft.apigatewayaggregation.productservice.core.usecase.BookUseCase;

@RestController
@RequestMapping("book")
@RequiredArgsConstructor
public class BookController {

    private final BookUseCase bookUseCase;

    @PostMapping
    public BookDtoRest addBook(@RequestBody BookDtoRest bookDtoRest) {
        return BookMapperRest.INSTANCE.bookToBookDtoRest(
                bookUseCase.addBook(
                        BookMapperRest.INSTANCE.bookDtoRestToBook(bookDtoRest)
                )
        );
    }

}
