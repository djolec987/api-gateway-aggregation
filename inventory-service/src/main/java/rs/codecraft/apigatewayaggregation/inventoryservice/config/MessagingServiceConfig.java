package rs.codecraft.apigatewayaggregation.inventoryservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import rs.codecraft.apigatewayaggregation.inventoryservice.adapter.messaging.kafka.listener.KafkaMessagingListener;

@Configuration
public class MessagingServiceConfig {

    @Bean
    KafkaMessagingListener messagingService() {
        return KafkaMessagingListener.builder().build();
    }
}
