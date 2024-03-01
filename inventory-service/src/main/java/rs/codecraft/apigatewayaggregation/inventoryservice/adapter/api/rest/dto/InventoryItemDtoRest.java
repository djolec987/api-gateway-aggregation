package rs.codecraft.apigatewayaggregation.inventoryservice.adapter.api.rest.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class InventoryItemDtoRest {

    private UUID id;
    private UUID productId;
    private int inStoreQuantity;
    private String storeName;


}
