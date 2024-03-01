package rs.codecraft.apigatewayaggregation.inventoryservice.adapter.api.rest.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rs.codecraft.apigatewayaggregation.inventoryservice.adapter.api.rest.dto.InventoryItemDtoRest;
import rs.codecraft.apigatewayaggregation.inventoryservice.adapter.api.rest.mapper.InventoryItemMapperRest;
import rs.codecraft.apigatewayaggregation.inventoryservice.core.usecase.InventoryItemUseCase;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("inventory-item")
@RequiredArgsConstructor
public class MainInventoryItemController {

    private final InventoryItemUseCase inventoryItemUseCase;

    //9f5ebb7f-5175-44fb-be40-0fb9981833cc
    @GetMapping("/pid/{productId}")
    public List<InventoryItemDtoRest> getAllInventoryItems(@PathVariable(name = "productId") UUID productId) {
        return InventoryItemMapperRest.INSTANCE.inventoryItemListToInventoryItemDtoRestList(
                inventoryItemUseCase.getByProductId(productId)
        );
    }

}
