package rs.codecraft.apigatewayaggregation.productservice.adapter.api.rest.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rs.codecraft.apigatewayaggregation.productservice.adapter.api.rest.dto.ProductDtoRest;
import rs.codecraft.apigatewayaggregation.productservice.adapter.api.rest.mapper.ProductMapperRest;
import rs.codecraft.apigatewayaggregation.productservice.core.entity.Product;
import rs.codecraft.apigatewayaggregation.productservice.core.usecase.ProductUseCase;

import java.util.List;

@RestController
@RequestMapping("product")
@RequiredArgsConstructor
public class MainProductController {

    private final ProductUseCase productUseCase;

    @GetMapping("/all")
    public List<ProductDtoRest> getAllProducts() {
        List<Product> ps = productUseCase.getAllProducts();
        System.out.println(ps);
        return ProductMapperRest.INSTANCE.productListToProductDtoRestList(productUseCase.getAllProducts());
    }

}
