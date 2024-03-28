package rs.codecraft.apigatewayaggregation.productservice.adapter.api.rest.dto;

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
public class AuthorDtoRest {

    private UUID id;
    private String firstName;
    private String lastName;
    private String country;
    private List<UUID> booksIds;

}
