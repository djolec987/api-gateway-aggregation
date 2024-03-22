package rs.codecraft.apigatewayaggregation.inventoryservice.adapter.messaging.kafka;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Builder;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import rs.codecraft.apigatewayaggregation.inventoryservice.core.entity.Product;
import rs.codecraft.apigatewayaggregation.inventoryservice.core.service.MessagingService;

@Builder
public class KafkaMessagingService implements MessagingService {

    @Override
    @KafkaListener(id = "inventory_service_consumer", topics = "products", properties = {"spring.json.value.default.type=rs.codecraft.apigatewayaggregation.inventoryservice.core.entity.Product"})
    public void processProductAdded(Product product) {
        System.out.println(product);
    }

}
