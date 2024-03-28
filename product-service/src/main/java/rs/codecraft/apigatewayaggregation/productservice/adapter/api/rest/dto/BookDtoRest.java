package rs.codecraft.apigatewayaggregation.productservice.adapter.api.rest.dto;

import lombok.*;
import rs.codecraft.apigatewayaggregation.productservice.core.entity.Author;

import java.util.List;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookDtoRest {

    private UUID id;
    private String title;
    private String isbn;
    private List<UUID> authorsIds;

}
