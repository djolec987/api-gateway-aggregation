package rs.codecraft.apigatewayaggregation.productservice.adapter.api.rest.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductDtoRest {

    private UUID id;
    private String nameOfTheProduct; // Deliberately not calling this property "name" because I want to demonstrate mappers.

}
