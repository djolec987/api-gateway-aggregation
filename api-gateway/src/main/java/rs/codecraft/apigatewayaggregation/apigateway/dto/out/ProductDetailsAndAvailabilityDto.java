package rs.codecraft.apigatewayaggregation.apigateway.dto.out;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import rs.codecraft.apigatewayaggregation.apigateway.dto.in.InventoryItemDtoIS;
import rs.codecraft.apigatewayaggregation.apigateway.dto.in.ProductDtoPS;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductDetailsAndAvailabilityDto {

    private ProductDtoPS productDetails;
    List<InventoryItemDtoIS> productAvailability;

}
