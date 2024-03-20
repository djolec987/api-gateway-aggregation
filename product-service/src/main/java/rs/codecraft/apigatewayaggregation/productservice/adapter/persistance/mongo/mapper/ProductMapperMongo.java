package rs.codecraft.apigatewayaggregation.productservice.adapter.persistance.mongo.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;
import rs.codecraft.apigatewayaggregation.productservice.adapter.persistance.mongo.dto.ProductDtoMongo;
import rs.codecraft.apigatewayaggregation.productservice.core.entity.Product;

import java.util.List;
import java.util.UUID;

@Mapper
public interface ProductMapperMongo {

    ProductMapperMongo INSTANCE = Mappers.getMapper(ProductMapperMongo.class);

    Product productDtoMongoToProduct(ProductDtoMongo productDtoMongo);

    ProductDtoMongo productToProductDtoMongo(Product product);

    List<Product> productDtoMongoListToProductList(List<ProductDtoMongo> productDtoMongoList);

    List<ProductDtoMongo> productListToProductDtoMongoList(List<Product> productList);

}
