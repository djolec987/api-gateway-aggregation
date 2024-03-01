package rs.codecraft.apigatewayaggregation.inventoryservice.adapter.persistance.mock.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class InventoryItemDtoMock {

    private UUID id;
    private UUID productId;
    private int inStockQuantity;
    private String locationOfItems;

}
