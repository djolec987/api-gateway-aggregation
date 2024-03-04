package rs.codecraft.apigatewayaggregation.productservice.adapter.api.rest.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rs.codecraft.apigatewayaggregation.productservice.adapter.api.rest.dto.ProductDtoRest;
import rs.codecraft.apigatewayaggregation.productservice.adapter.api.rest.mapper.ProductMapperRest;
import rs.codecraft.apigatewayaggregation.productservice.core.entity.Product;
import rs.codecraft.apigatewayaggregation.productservice.core.usecase.ProductUseCase;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

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

    @GetMapping("/{id}")
    public ProductDtoRest getById(@PathVariable(name = "id") UUID id) {
        Optional<Product> productOptional = productUseCase.getById(id);
        if (productOptional.isPresent()) {
            return ProductMapperRest.INSTANCE.productToProductDtoRest(productOptional.get());
        } else {
            // TODO: We should throw an exception here - but not from here, rather the exception should be thrown from the usecase
            return null;
        }
    }

}
