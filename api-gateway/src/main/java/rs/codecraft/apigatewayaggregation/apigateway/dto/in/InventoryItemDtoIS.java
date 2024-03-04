package rs.codecraft.apigatewayaggregation.apigateway.dto.in;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class InventoryItemDtoIS {

    private UUID id;
    private UUID productId;
    private int inStoreQuantity;
    private String storeName;

}
