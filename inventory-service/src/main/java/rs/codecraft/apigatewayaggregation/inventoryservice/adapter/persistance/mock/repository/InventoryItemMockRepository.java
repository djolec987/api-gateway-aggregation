package rs.codecraft.apigatewayaggregation.inventoryservice.adapter.persistance.mock.repository;

import jakarta.annotation.PostConstruct;
import lombok.Builder;
import rs.codecraft.apigatewayaggregation.inventoryservice.adapter.persistance.mock.dto.InventoryItemDtoMock;
import rs.codecraft.apigatewayaggregation.inventoryservice.adapter.persistance.mock.mapper.InventoryItemMapperMock;
import rs.codecraft.apigatewayaggregation.inventoryservice.core.entity.InventoryItem;
import rs.codecraft.apigatewayaggregation.inventoryservice.core.repository.InventoryItemRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Builder
public class InventoryItemMockRepository implements InventoryItemRepository {

    private List<InventoryItemDtoMock> inventoryItems;

    @PostConstruct
    public void initalize() {
        this.inventoryItems = new ArrayList<>();
        this.inventoryItems.add(
                new InventoryItemDtoMock(UUID.fromString("c9a0ee0d-19c3-44cf-a63e-769f8a1515fe"),
                        UUID.fromString("9f5ebb7f-5175-44fb-be40-0fb9981833cc"),
                        15,
                        "Delta Store")
        );
        this.inventoryItems.add(
                new InventoryItemDtoMock(UUID.fromString("77efe97f-bc21-4f0d-bd65-241595e700f7"),
                        UUID.fromString("9f5ebb7f-5175-44fb-be40-0fb9981833cc"),
                        2,
                        "Gamma Store")
        );
        this.inventoryItems.add(
                new InventoryItemDtoMock(UUID.fromString("d0d291e6-c965-4e3a-b77d-c74963b3bf6a"),
                        UUID.fromString("358f07e7-f2c9-4b64-ab87-51e4b80f1d7e"),
                        8,
                        "Gamma Store")
        );
    }

    @Override
    public List<InventoryItem> getByProductId(UUID productId) {
        return InventoryItemMapperMock.INSTANCE.inventoryItemDtoMockListToInventoryItemList(
                this.inventoryItems.stream().filter(i -> i.getProductId().equals(productId)).collect(Collectors.toList())
        );
    }
}
