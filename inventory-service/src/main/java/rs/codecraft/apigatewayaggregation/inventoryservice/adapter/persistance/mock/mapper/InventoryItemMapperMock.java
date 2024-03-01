package rs.codecraft.apigatewayaggregation.inventoryservice.adapter.persistance.mock.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import rs.codecraft.apigatewayaggregation.inventoryservice.adapter.persistance.mock.dto.InventoryItemDtoMock;
import rs.codecraft.apigatewayaggregation.inventoryservice.core.entity.InventoryItem;

import java.util.List;

@Mapper
public interface InventoryItemMapperMock {

    InventoryItemMapperMock INSTANCE = Mappers.getMapper(InventoryItemMapperMock.class);

    @Mapping(source = "locationOfItems", target = "location")
    @Mapping(source = "inStockQuantity", target = "quantity")
    InventoryItem inventoryItemDtoMockToInventoryItem(InventoryItemDtoMock inventoryItemDtoMock);

    @Mapping(source = "location", target = "locationOfItems")
    @Mapping(source = "quantity", target = "inStockQuantity")
    InventoryItemDtoMock inventoryItemToInventoryItemDtoMock(InventoryItem inventoryItem);

    List<InventoryItem> inventoryItemDtoMockListToInventoryItemList(List<InventoryItemDtoMock> inventoryItemDtoMockList);

    List<InventoryItemDtoMock> inventoryItemListToInventoryItemDtoMockList(List<InventoryItem> inventoryItemList);

}
