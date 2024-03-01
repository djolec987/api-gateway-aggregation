package rs.codecraft.apigatewayaggregation.inventoryservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import rs.codecraft.apigatewayaggregation.inventoryservice.core.repository.InventoryItemRepository;
import rs.codecraft.apigatewayaggregation.inventoryservice.core.service.InventoryItemService;
import rs.codecraft.apigatewayaggregation.inventoryservice.core.service.impl.InventoryItemServiceImpl;

@Configuration
public class ServiceConfig {

    @Bean
    InventoryItemService inventoryItemService(InventoryItemRepository inventoryItemRepository) {
        return InventoryItemServiceImpl.builder()
                .inventoryItemRepository(inventoryItemRepository)
                .build();
    }

}
