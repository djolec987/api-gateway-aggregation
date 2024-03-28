package rs.codecraft.apigatewayaggregation.productservice.core.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Author {

    private UUID id;
    private String firstName;
    private String lastName;
    private String country;
    private List<UUID> booksIds;

}
