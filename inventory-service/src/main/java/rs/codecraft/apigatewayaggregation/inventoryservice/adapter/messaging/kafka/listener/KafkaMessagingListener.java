package rs.codecraft.apigatewayaggregation.inventoryservice.adapter.messaging.kafka.listener;

import lombok.Builder;
import org.springframework.kafka.annotation.KafkaListener;
import rs.codecraft.apigatewayaggregation.inventoryservice.core.entity.Product;

@Builder
public class KafkaMessagingListener {

    @KafkaListener(id = "inventory_service_consumer", topics = "products", properties = {"spring.json.value.default.type=rs.codecraft.apigatewayaggregation.inventoryservice.core.entity.Product"})
    public void processProductAdded(Product product) {
        System.out.println(product);
    }

}
