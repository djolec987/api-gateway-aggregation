package rs.codecraft.apigatewayaggregation.productservice.core.service.impl;

import lombok.Builder;
import rs.codecraft.apigatewayaggregation.productservice.core.entity.Author;
import rs.codecraft.apigatewayaggregation.productservice.core.repository.AuthorRepository;
import rs.codecraft.apigatewayaggregation.productservice.core.service.AuthorService;

@Builder
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;

    @Override
    public Author addAuthor(Author author) {
        return authorRepository.addAuthor(author);
    }
}
