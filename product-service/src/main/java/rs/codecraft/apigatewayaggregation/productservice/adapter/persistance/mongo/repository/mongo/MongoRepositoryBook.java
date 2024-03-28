package rs.codecraft.apigatewayaggregation.productservice.adapter.persistance.mongo.repository.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;
import rs.codecraft.apigatewayaggregation.productservice.adapter.persistance.mongo.dto.BookDtoMongo;

import java.util.UUID;

public interface MongoRepositoryBook extends MongoRepository<BookDtoMongo, UUID> {
}
