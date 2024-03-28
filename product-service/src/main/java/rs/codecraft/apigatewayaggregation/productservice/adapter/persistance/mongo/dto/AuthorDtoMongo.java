package rs.codecraft.apigatewayaggregation.productservice.adapter.persistance.mongo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "authors")
public class AuthorDtoMongo {

    @Id
    private UUID id;

    private String firstName;

    private String lastName;

    private String country;

    private List<UUID> booksIds;


}
