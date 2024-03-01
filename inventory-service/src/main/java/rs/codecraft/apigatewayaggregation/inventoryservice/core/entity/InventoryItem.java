package rs.codecraft.apigatewayaggregation.inventoryservice.core.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class InventoryItem {

    private UUID id;
    private UUID productId;
    private int quantity;
    private String location;

}
