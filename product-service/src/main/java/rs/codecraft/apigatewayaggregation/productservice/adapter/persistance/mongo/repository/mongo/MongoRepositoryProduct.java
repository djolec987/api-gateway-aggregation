package rs.codecraft.apigatewayaggregation.productservice.adapter.persistance.mongo.repository.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;
import rs.codecraft.apigatewayaggregation.productservice.adapter.persistance.mongo.dto.ProductDtoMongo;

import java.util.UUID;

public interface MongoRepositoryProduct extends MongoRepository<ProductDtoMongo, UUID> {

}
