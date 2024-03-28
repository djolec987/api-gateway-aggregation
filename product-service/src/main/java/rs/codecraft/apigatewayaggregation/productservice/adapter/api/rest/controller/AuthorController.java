package rs.codecraft.apigatewayaggregation.productservice.adapter.api.rest.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rs.codecraft.apigatewayaggregation.productservice.adapter.api.rest.dto.AuthorDtoRest;
import rs.codecraft.apigatewayaggregation.productservice.adapter.api.rest.mapper.AuthorMapperRest;
import rs.codecraft.apigatewayaggregation.productservice.core.usecase.AuthorUseCase;

@RestController
@RequestMapping("author")
@RequiredArgsConstructor
public class AuthorController {

    private final AuthorUseCase authorUseCase;

    @PostMapping
    public AuthorDtoRest addAuthor(@RequestBody AuthorDtoRest authorDtoRest) {
        return AuthorMapperRest.INSTANCE.authorToAuthorDtoRest(
                authorUseCase.addAuthor(
                        AuthorMapperRest.INSTANCE.authorDtoRestToAuthor(authorDtoRest)
                )
        );
    }

}
