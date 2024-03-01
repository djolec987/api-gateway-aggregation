package rs.codecraft.apigatewayaggregation.inventoryservice.core.service.impl;

import lombok.Builder;
import rs.codecraft.apigatewayaggregation.inventoryservice.core.entity.InventoryItem;
import rs.codecraft.apigatewayaggregation.inventoryservice.core.repository.InventoryItemRepository;
import rs.codecraft.apigatewayaggregation.inventoryservice.core.service.InventoryItemService;

import java.util.List;
import java.util.UUID;

@Builder
public class InventoryItemServiceImpl implements InventoryItemService {

    private final InventoryItemRepository inventoryItemRepository;

    @Override
    public List<InventoryItem> getByProductId(UUID productId) {
        return inventoryItemRepository.getByProductId(productId);
    }
}
