package rs.codecraft.apigatewayaggregation.productservice.core.entity;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;
import java.util.UUID;

@Data
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class Book extends Product {

    private String title;
    private String isbn;
    private List<UUID> authorsIds;

}
