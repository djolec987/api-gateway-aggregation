package rs.codecraft.apigatewayaggregation.productservice.adapter.persistance.mongo.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import rs.codecraft.apigatewayaggregation.productservice.adapter.persistance.mongo.dto.AuthorDtoMongo;
import rs.codecraft.apigatewayaggregation.productservice.core.entity.Author;

import java.util.List;

@Mapper
public interface AuthorMapperMongo {

    AuthorMapperMongo INSTANCE = Mappers.getMapper(AuthorMapperMongo.class);

    Author authorDtoMongoToAuthor(AuthorDtoMongo authorDtoMongo);

    AuthorDtoMongo authorToAuthorDtoMongo(Author author);

    List<Author> authorDtoMongoListToAuthorList(List<AuthorDtoMongo> authorDtoMongoList);

    List<AuthorDtoMongo> authroListToAuthorMongoDtoList(List<Author> authorList);

}
