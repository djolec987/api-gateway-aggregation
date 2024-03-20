package rs.codecraft.apigatewayaggregation.inventoryservice.core.service;

import rs.codecraft.apigatewayaggregation.inventoryservice.core.entity.Product;

public interface MessagingService {

    void processProductAdded(Product product);

}
