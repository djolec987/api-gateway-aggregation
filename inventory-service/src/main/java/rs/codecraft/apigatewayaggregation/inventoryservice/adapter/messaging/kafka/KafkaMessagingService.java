package rs.codecraft.apigatewayaggregation.inventoryservice.adapter.messaging.kafka;

import lombok.Builder;
import org.springframework.kafka.annotation.KafkaListener;
import rs.codecraft.apigatewayaggregation.inventoryservice.core.entity.Product;
import rs.codecraft.apigatewayaggregation.inventoryservice.core.service.MessagingService;

@Builder
public class KafkaMessagingService implements MessagingService {

    @Override
    @KafkaListener(id = "inventory_service_consumer", topics = "products")
    public void processProductAdded(Product product) {
        System.out.println(product);
    }
}
