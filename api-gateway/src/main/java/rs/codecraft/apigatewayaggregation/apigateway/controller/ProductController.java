package rs.codecraft.apigatewayaggregation.apigateway.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import rs.codecraft.apigatewayaggregation.apigateway.dto.in.InventoryItemDtoIS;
import rs.codecraft.apigatewayaggregation.apigateway.dto.in.ProductDtoPS;
import rs.codecraft.apigatewayaggregation.apigateway.dto.out.ProductDetailsAndAvailabilityDto;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("product")
@RequiredArgsConstructor
public class ProductController {

    private final WebClient.Builder webClientBuilder;

    @GetMapping("details-and-availability/{productId}")
    public ProductDetailsAndAvailabilityDto getProductDetailsAndAvailability(@PathVariable(name = "productId") UUID productId) {
        ProductDtoPS product = webClientBuilder.build()
                .get()
                .uri("http://localhost:8081/product/" + productId.toString())
                .retrieve()
                .bodyToMono(ProductDtoPS.class)
                .block();
        List<InventoryItemDtoIS> inventoryItems = webClientBuilder.build()
                .get()
                .uri("http://localhost:8082/inventory-item/pid/" + productId.toString())
                .retrieve()
                .bodyToMono(new ParameterizedTypeReference<List<InventoryItemDtoIS>>(){})
                .block();

        return ProductDetailsAndAvailabilityDto.builder()
                .productDetails(product)
                .productAvailability(inventoryItems)
                .build();
    }

}
