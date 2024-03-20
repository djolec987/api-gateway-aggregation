package rs.codecraft.apigatewayaggregation.productservice.core.service;

import rs.codecraft.apigatewayaggregation.productservice.core.entity.Product;

public interface MessagingService {

    void sendProductAddedMessage(Product product);

}
