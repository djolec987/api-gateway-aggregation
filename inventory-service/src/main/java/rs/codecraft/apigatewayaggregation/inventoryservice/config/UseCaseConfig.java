package rs.codecraft.apigatewayaggregation.inventoryservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import rs.codecraft.apigatewayaggregation.inventoryservice.core.service.InventoryItemService;
import rs.codecraft.apigatewayaggregation.inventoryservice.core.usecase.InventoryItemUseCase;
import rs.codecraft.apigatewayaggregation.inventoryservice.core.usecase.impl.InventoryItemUseCaseImpl;

@Configuration
public class UseCaseConfig {

    @Bean
    InventoryItemUseCase inventoryItemUseCase(InventoryItemService inventoryItemService) {
        return InventoryItemUseCaseImpl.builder()
                .inventoryItemService(inventoryItemService)
                .build();
    }

}
