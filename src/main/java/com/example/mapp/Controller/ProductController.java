package com.example.mapp.Controller;

import com.example.mapp.Service.ProductService;
import com.example.mapp.dto.ProductRequest;
import com.example.mapp.dto.ProductResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
@Tag(name = "Products", description = "Product management APIs")
public class ProductController {

    private final ProductService productService;

    @Operation(summary = "Create a product", description = "Creates a single product record.")
    @ApiResponses({
            @ApiResponse(responseCode = "201", description = "Product created successfully")
    })
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody ProductRequest productRequest) {

        productService.createProduct(productRequest);

    }

    @Operation(summary = "Create products in bulk", description = "Creates multiple product records in one request.")
    @ApiResponses({
            @ApiResponse(responseCode = "201", description = "Products created successfully")
    })
    @PostMapping("/batch")
    @ResponseStatus(HttpStatus.CREATED)
    public void createProducts(@RequestBody List<ProductRequest> products) {
        productService.createProducts(products);
    }

    @Operation(summary = "Get all products", description = "Returns all available products.")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Products returned successfully")
    })
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductResponse> getProducts() {

       return productService.getAllProducts();
    }


}
