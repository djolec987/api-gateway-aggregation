package rs.codecraft.apigatewayaggregation.productservice.adapter.persistance.mock.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import rs.codecraft.apigatewayaggregation.productservice.adapter.persistance.mock.dto.ProductDtoMock;
import rs.codecraft.apigatewayaggregation.productservice.core.entity.Product;

import java.util.List;

@Mapper
public interface ProductMapperMock {

    ProductMapperMock INSTANCE = Mappers.getMapper(ProductMapperMock.class);

    @Mapping(source = "productName", target = "name")
    Product productDtoMockToProduct(ProductDtoMock productDtoMock);

    @Mapping(source = "name", target = "productName")
    ProductDtoMock productToProductDtoMock(Product product);

    List<Product> productDtoMockListToProductList(List<ProductDtoMock> productDtoMockList);

    List<ProductDtoMock> productListToProductDtoMockList(List<Product> productList);

}
