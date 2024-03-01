package rs.codecraft.apigatewayaggregation.inventoryservice.adapter.api.rest.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import rs.codecraft.apigatewayaggregation.inventoryservice.adapter.api.rest.dto.InventoryItemDtoRest;
import rs.codecraft.apigatewayaggregation.inventoryservice.core.entity.InventoryItem;

import java.util.List;

@Mapper
public interface InventoryItemMapperRest {

    InventoryItemMapperRest INSTANCE = Mappers.getMapper(InventoryItemMapperRest.class);

    @Mapping(source = "inStoreQuantity", target = "quantity")
    @Mapping(source = "storeName", target = "location")
    InventoryItem inventoryItemDtoRestToInventoryItem(InventoryItemDtoRest inventoryItemDtoRest);

    @Mapping(source = "quantity", target = "inStoreQuantity")
    @Mapping(source = "location", target = "storeName")
    InventoryItemDtoRest inventoryItemToInventoryItemDtoRest(InventoryItem inventoryItem);

    List<InventoryItem> inventoryItemDtoRestListToInventoryItemList(List<InventoryItemDtoRest> inventoryItemDtoRestList);

    List<InventoryItemDtoRest> inventoryItemListToInventoryItemDtoRestList(List<InventoryItem> inventoryItemList);

}
