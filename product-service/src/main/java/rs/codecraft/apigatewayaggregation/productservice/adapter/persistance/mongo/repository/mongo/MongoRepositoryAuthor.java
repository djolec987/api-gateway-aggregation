package rs.codecraft.apigatewayaggregation.productservice.adapter.persistance.mongo.repository.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;
import rs.codecraft.apigatewayaggregation.productservice.adapter.persistance.mongo.dto.AuthorDtoMongo;

import java.util.UUID;

public interface MongoRepositoryAuthor extends MongoRepository<AuthorDtoMongo, UUID> {
}
