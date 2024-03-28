package rs.codecraft.apigatewayaggregation.productservice.core.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import rs.codecraft.apigatewayaggregation.productservice.core.entity.value.Category;

import java.util.UUID;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    private UUID id;
    private Category category;

}
