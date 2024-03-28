package rs.codecraft.apigatewayaggregation.productservice.core.entity;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Data
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class Phone extends Product {

    private String model;
    private Integer memory;
    private Manufacturer manufacturer;

}
