package rs.codecraft.apigatewayaggregation.inventoryservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import rs.codecraft.apigatewayaggregation.inventoryservice.adapter.persistance.mock.repository.InventoryItemMockRepository;
import rs.codecraft.apigatewayaggregation.inventoryservice.core.repository.InventoryItemRepository;

@Configuration
public class RepositoryConfig {

    @Bean
    InventoryItemRepository inventoryItemRepository() {
        return InventoryItemMockRepository.builder().build();
    }

}
