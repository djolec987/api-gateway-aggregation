package rs.codecraft.apigatewayaggregation.productservice.adapter.messaging.kafka.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import rs.codecraft.apigatewayaggregation.productservice.adapter.messaging.kafka.dto.ProductDtoKafka;
import rs.codecraft.apigatewayaggregation.productservice.core.entity.Product;

import java.util.List;

@Mapper
public interface ProductMapperKafka {

    ProductMapperKafka INSTANCE = Mappers.getMapper(ProductMapperKafka.class);

    Product productDtoKafkaToProduct(ProductDtoKafka productDtoKafka);

    ProductDtoKafka productToProductDtoKafka(Product product);

    List<Product> productDtoKafkaListToProductList(List<ProductDtoKafka> productDtoKafkaList);

    List<ProductDtoKafka> productListToProductDtoKafkaList(List<Product> productList);

}
