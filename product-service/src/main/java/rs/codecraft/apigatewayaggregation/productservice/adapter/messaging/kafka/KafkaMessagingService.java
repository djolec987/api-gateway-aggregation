package rs.codecraft.apigatewayaggregation.productservice.adapter.messaging.kafka;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Builder;
import org.springframework.kafka.core.KafkaTemplate;
import rs.codecraft.apigatewayaggregation.productservice.core.entity.Product;
import rs.codecraft.apigatewayaggregation.productservice.core.service.MessagingService;

@Builder
public class KafkaMessagingService implements MessagingService {

    private final KafkaTemplate<String, Object> kafkaTemplate;

    @Override
    public void sendProductAddedMessage(Product product) {
//        ObjectMapper om = new ObjectMapper();
//        String productAsString = null;
//        try {
//            productAsString = om.writeValueAsString(product);
//        } catch (JsonProcessingException e) {
//            throw new RuntimeException("Error converting product " + product + " to JSON string.", e);
//        }
//        kafkaTemplate.send("products", "products_service", productAsString);
        kafkaTemplate.send("products", "products_service", product);
    }
}
