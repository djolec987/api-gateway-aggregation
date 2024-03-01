package rs.codecraft.apigatewayaggregation.inventoryservice.adapter.persistance.db.repository;

import rs.codecraft.apigatewayaggregation.inventoryservice.core.entity.InventoryItem;
import rs.codecraft.apigatewayaggregation.inventoryservice.core.repository.InventoryItemRepository;

import java.util.List;
import java.util.UUID;

public class InventoryItemDBRepository implements InventoryItemRepository {
    @Override
    public List<InventoryItem> getByProductId(UUID productId) {
        throw new RuntimeException("Not implemented yet!");
    }
}
