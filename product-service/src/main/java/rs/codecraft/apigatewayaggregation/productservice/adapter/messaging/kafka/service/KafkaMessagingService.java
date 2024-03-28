package rs.codecraft.apigatewayaggregation.productservice.adapter.messaging.kafka.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Builder;
import org.springframework.kafka.core.KafkaTemplate;
import rs.codecraft.apigatewayaggregation.productservice.adapter.messaging.kafka.dto.ProductDtoKafka;
import rs.codecraft.apigatewayaggregation.productservice.adapter.messaging.kafka.mapper.ProductMapperKafka;
import rs.codecraft.apigatewayaggregation.productservice.core.entity.Product;
import rs.codecraft.apigatewayaggregation.productservice.core.service.MessagingService;

@Builder
public class KafkaMessagingService implements MessagingService {

    private final KafkaTemplate<String, Object> kafkaTemplate;

    @Override
    public void sendProductAddedMessage(Product product) {
        ProductDtoKafka productDto = ProductMapperKafka.INSTANCE.productToProductDtoKafka(product);
        kafkaTemplate.send("products", "products_service", productDto);
    }
}
