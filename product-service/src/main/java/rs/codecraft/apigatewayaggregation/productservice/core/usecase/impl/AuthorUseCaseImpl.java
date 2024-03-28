package rs.codecraft.apigatewayaggregation.productservice.core.usecase.impl;

import lombok.Builder;
import rs.codecraft.apigatewayaggregation.productservice.core.entity.Author;
import rs.codecraft.apigatewayaggregation.productservice.core.service.AuthorService;
import rs.codecraft.apigatewayaggregation.productservice.core.usecase.AuthorUseCase;

@Builder
public class AuthorUseCaseImpl implements AuthorUseCase {

    private final AuthorService authorService;

    @Override
    public Author addAuthor(Author author) {
        return authorService.addAuthor(author);
    }
}
