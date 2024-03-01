package rs.codecraft.apigatewayaggregation.inventoryservice.adapter.persistance.db.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import rs.codecraft.apigatewayaggregation.inventoryservice.adapter.persistance.db.dto.InventoryItemDtoDB;
import rs.codecraft.apigatewayaggregation.inventoryservice.core.entity.InventoryItem;

import java.util.List;

@Mapper
public interface InventoryItemMapperDB {

    InventoryItemMapperDB INSTANCE = Mappers.getMapper(InventoryItemMapperDB.class);

    @Mapping(source = "locationOfItems", target = "location")
    InventoryItem inventoryItemDtoDBToInventoryItem(InventoryItemDtoDB inventoryItemDtoDB);

    @Mapping(source = "location", target = "locationOfItems")
    InventoryItemDtoDB inventoryItemToInventoryItemDtoDB(InventoryItem inventoryItem);

    List<InventoryItem> inventoryItemDtoDBListToInventoryItemList(List<InventoryItemDtoDB> inventoryItemDtoDBList);

    List<InventoryItemDtoDB> inventoryItemListToInventoryItemDtoDBList(List<InventoryItem> inventoryItemList);

}
