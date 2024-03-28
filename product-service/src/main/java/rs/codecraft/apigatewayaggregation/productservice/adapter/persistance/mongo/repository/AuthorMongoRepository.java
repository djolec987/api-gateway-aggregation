package rs.codecraft.apigatewayaggregation.productservice.adapter.persistance.mongo.repository;

import lombok.Builder;
import rs.codecraft.apigatewayaggregation.productservice.adapter.persistance.mongo.dto.AuthorDtoMongo;
import rs.codecraft.apigatewayaggregation.productservice.adapter.persistance.mongo.mapper.AuthorMapperMongo;
import rs.codecraft.apigatewayaggregation.productservice.adapter.persistance.mongo.repository.mongo.MongoRepositoryAuthor;
import rs.codecraft.apigatewayaggregation.productservice.core.entity.Author;
import rs.codecraft.apigatewayaggregation.productservice.core.repository.AuthorRepository;

import java.util.UUID;

@Builder
public class AuthorMongoRepository implements AuthorRepository {

    private final MongoRepositoryAuthor mongoRepositoryAuthor;

    @Override
    public Author addAuthor(Author author) {
        AuthorDtoMongo authorDtoMongo = AuthorMapperMongo.INSTANCE.authorToAuthorDtoMongo(author);
        authorDtoMongo.setId(UUID.randomUUID());
        return AuthorMapperMongo.INSTANCE.authorDtoMongoToAuthor(
                mongoRepositoryAuthor.insert(authorDtoMongo)
        );
    }
}
