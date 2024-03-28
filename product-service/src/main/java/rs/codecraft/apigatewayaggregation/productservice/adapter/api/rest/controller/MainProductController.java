package rs.codecraft.apigatewayaggregation.productservice.adapter.api.rest.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import rs.codecraft.apigatewayaggregation.productservice.adapter.api.rest.dto.BookDtoRest;
import rs.codecraft.apigatewayaggregation.productservice.adapter.api.rest.dto.ProductDtoRest;
import rs.codecraft.apigatewayaggregation.productservice.adapter.api.rest.mapper.BookMapperRest;
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

//    private final BookMapperRest bookMapperRest;

    @GetMapping("/all")
    public List<ProductDtoRest> getAllProducts() {
//        List<Product> ps = productUseCase.getAllProducts();
//        return ProductMapperRest.INSTANCE.productListToProductDtoRestList(productUseCase.getAllProducts());
        return null;
    }

    @GetMapping("/{id}")
    public ProductDtoRest getById(@PathVariable(name = "id") UUID id) {
//        Optional<Product> productOptional = productUseCase.getById(id);
//        if (productOptional.isPresent()) {
//            return ProductMapperRest.INSTANCE.productToProductDtoRest(productOptional.get());
//        } else {
//            // TODO: We should throw an exception here - but not from here, rather the exception should be thrown from the usecase
//            return null;
//        }
        return null;
    }

    @PostMapping
    public ProductDtoRest addProduct(@RequestBody ProductDtoRest productDtoRest) {
//        Product createdProduct = productUseCase.addProduct(
//                ProductMapperRest.INSTANCE.productDtoRestToProduct(productDtoRest)
//        );
//        return ProductMapperRest.INSTANCE.productToProductDtoRest(createdProduct);
        return null;
    }

    @PostMapping("/book")
    public void addBook(@RequestBody BookDtoRest bookDtoRest) {
//        System.out.println(
//                bookMapperRest.bookDtoRestToBook(bookDtoRest)
//        );
    }

}
