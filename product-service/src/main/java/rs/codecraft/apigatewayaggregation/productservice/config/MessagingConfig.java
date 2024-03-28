package rs.codecraft.apigatewayaggregation.productservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.KafkaTemplate;
import rs.codecraft.apigatewayaggregation.productservice.adapter.messaging.kafka.service.KafkaMessagingService;

@Configuration
public class MessagingConfig {

    @Bean
    KafkaMessagingService kafkaService(KafkaTemplate kafkaTemplate) {
        return KafkaMessagingService.builder()
                .kafkaTemplate(kafkaTemplate)
                .build();
    }

}
