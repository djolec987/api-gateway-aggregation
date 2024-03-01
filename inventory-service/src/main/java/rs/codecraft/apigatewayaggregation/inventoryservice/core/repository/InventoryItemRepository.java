package rs.codecraft.apigatewayaggregation.inventoryservice.core.repository;

import rs.codecraft.apigatewayaggregation.inventoryservice.core.entity.InventoryItem;

import java.util.List;
import java.util.UUID;

public interface InventoryItemRepository {

    List<InventoryItem> getByProductId(UUID productId);

}
