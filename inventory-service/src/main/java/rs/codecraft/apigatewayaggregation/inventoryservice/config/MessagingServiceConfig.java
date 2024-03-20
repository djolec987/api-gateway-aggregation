package rs.codecraft.apigatewayaggregation.inventoryservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import rs.codecraft.apigatewayaggregation.inventoryservice.adapter.messaging.kafka.KafkaMessagingService;
import rs.codecraft.apigatewayaggregation.inventoryservice.core.service.MessagingService;

@Configuration
public class MessagingServiceConfig {

    @Bean
    MessagingService messagingService() {
        return KafkaMessagingService.builder().build();
    }
}
