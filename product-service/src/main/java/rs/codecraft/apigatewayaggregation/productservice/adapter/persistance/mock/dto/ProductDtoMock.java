package rs.codecraft.apigatewayaggregation.productservice.adapter.persistance.mock.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductDtoMock {

    private UUID id;
    private String productName; // Deliberately not calling this property "name" because I want to demonstrate mappers.

}
