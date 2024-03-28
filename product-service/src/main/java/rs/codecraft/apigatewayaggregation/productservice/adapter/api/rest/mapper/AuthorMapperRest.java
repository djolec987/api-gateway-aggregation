package rs.codecraft.apigatewayaggregation.productservice.adapter.api.rest.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import rs.codecraft.apigatewayaggregation.productservice.adapter.api.rest.dto.AuthorDtoRest;
import rs.codecraft.apigatewayaggregation.productservice.core.entity.Author;

import java.util.List;

@Mapper
public interface AuthorMapperRest {

    AuthorMapperRest INSTANCE = Mappers.getMapper(AuthorMapperRest.class);

    Author authorDtoRestToAuthor(AuthorDtoRest authorDtoRest);

    AuthorDtoRest authorToAuthorDtoRest(Author author);

    List<Author> authroDtoRestListToAuthorList(List<AuthorDtoRest> authroDtoRestList);

    List<AuthorDtoRest> authorListToAuthroDtoRestList(List<Author> authorList);

}
