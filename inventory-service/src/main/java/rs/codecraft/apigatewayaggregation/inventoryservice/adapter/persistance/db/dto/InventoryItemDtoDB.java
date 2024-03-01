package rs.codecraft.apigatewayaggregation.inventoryservice.adapter.persistance.db.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class InventoryItemDtoDB {

    private UUID id;
    private UUID productId;
    private int quantity;
    private String locationOfItems;

}
