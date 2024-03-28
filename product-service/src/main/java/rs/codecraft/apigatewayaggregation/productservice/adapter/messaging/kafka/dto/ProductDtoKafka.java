package rs.codecraft.apigatewayaggregation.productservice.adapter.messaging.kafka.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductDtoKafka {

    private UUID id;
    private String name;

}
