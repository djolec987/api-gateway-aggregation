package rs.codecraft.apigatewayaggregation.productservice.adapter.messaging.kafka;

import lombok.Builder;
import org.springframework.kafka.core.KafkaTemplate;
import rs.codecraft.apigatewayaggregation.productservice.core.entity.Product;
import rs.codecraft.apigatewayaggregation.productservice.core.service.MessagingService;

@Builder
public class KafkaMessagingService implements MessagingService {

    private final KafkaTemplate<String, Object> kafkaTemplate;

    @Override
    public void sendProductAddedMessage(Product product) {
        kafkaTemplate.send("products", "products_service", product);
    }
}
