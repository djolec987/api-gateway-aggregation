package rs.codecraft.apigatewayaggregation.inventoryservice.core.service;

import rs.codecraft.apigatewayaggregation.inventoryservice.core.entity.InventoryItem;

import java.util.List;
import java.util.UUID;

public interface InventoryItemService {

    List<InventoryItem> getByProductId(UUID productId);

}
