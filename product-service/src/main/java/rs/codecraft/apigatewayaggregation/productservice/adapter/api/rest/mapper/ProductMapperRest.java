package rs.codecraft.apigatewayaggregation.productservice.adapter.api.rest.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import rs.codecraft.apigatewayaggregation.productservice.adapter.api.rest.dto.ProductDtoRest;
import rs.codecraft.apigatewayaggregation.productservice.adapter.persistance.mock.dto.ProductDtoMock;
import rs.codecraft.apigatewayaggregation.productservice.core.entity.Product;

import java.util.List;

@Mapper
public interface ProductMapperRest {

    ProductMapperRest INSTANCE = Mappers.getMapper(ProductMapperRest.class);

//    @Mapping(source = "nameOfTheProduct", target = "name")
//    Product productDtoRestToProduct(ProductDtoRest productDtoRest);
//
//    @Mapping(source = "name", target = "nameOfTheProduct")
//    ProductDtoRest productToProductDtoRest(Product product);
//
//    List<Product> productDtoRestListToProductList(List<ProductDtoRest> productDtoRestList);
//
//    List<ProductDtoRest> productListToProductDtoRestList(List<Product> productList);
}
