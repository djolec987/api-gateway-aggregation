package rs.codecraft.apigatewayaggregation.inventoryservice.core.usecase;

import rs.codecraft.apigatewayaggregation.inventoryservice.core.entity.InventoryItem;

import java.util.List;
import java.util.UUID;

public interface InventoryItemUseCase {

    List<InventoryItem> getByProductId(UUID productId);

}
