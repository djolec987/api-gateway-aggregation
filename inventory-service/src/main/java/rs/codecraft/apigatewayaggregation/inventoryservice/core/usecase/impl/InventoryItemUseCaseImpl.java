package rs.codecraft.apigatewayaggregation.inventoryservice.core.usecase.impl;

import lombok.Builder;
import rs.codecraft.apigatewayaggregation.inventoryservice.core.entity.InventoryItem;
import rs.codecraft.apigatewayaggregation.inventoryservice.core.service.InventoryItemService;
import rs.codecraft.apigatewayaggregation.inventoryservice.core.usecase.InventoryItemUseCase;

import java.util.List;
import java.util.UUID;

@Builder
public class InventoryItemUseCaseImpl implements InventoryItemUseCase {

    private final InventoryItemService inventoryItemService;

    @Override
    public List<InventoryItem> getByProductId(UUID productId) {
        return inventoryItemService.getByProductId(productId);
    }
}
