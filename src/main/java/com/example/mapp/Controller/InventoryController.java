package com.example.mapp.Controller;

import com.example.mapp.Models.Inventory;
import com.example.mapp.Service.InventoryService;
import com.example.mapp.dto.InventoryDelete;
import com.example.mapp.dto.InventoryRequest;
import com.example.mapp.dto.InventoryResponse;
import com.example.mapp.dto.InventoryUpdate;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/inventory")
@RequiredArgsConstructor
@Tag(name = "Inventory", description = "Inventory stock APIs")
public class InventoryController {

    private final InventoryService inventoryService;

    @Operation(summary = "Check inventory stock", description = "Checks whether inventory exists and has quantity greater than zero for the given SKU code.")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Stock status returned successfully")
    })
    @GetMapping("/{sku-code}")
    @ResponseStatus(HttpStatus.OK)
    public InventoryResponse isInStock(@PathVariable("sku-code") String skuCode){
        boolean inStock = inventoryService.isInStock(skuCode);

        return InventoryResponse.builder()
                .skuCode(skuCode)
                .inStock(inStock)
                .message("Product with SKU " + skuCode + (inStock ? " is in stock" : " is out of stock"))
                .build();
    }

    @Operation(
            summary = "Create inventory product",
            description = "Creates a product stock record in the inventory table."
    )
    @ApiResponses({
            @ApiResponse(responseCode = "201", description = "Inventory product created successfully")
    })
    @PostMapping("/api/inventory/product")
    @ResponseStatus(HttpStatus.CREATED)
    public String createInventoryProduct(@RequestBody InventoryRequest inventoryRequest){

        inventoryService.createInventoryProduct(inventoryRequest);

        return "Inventory product created successfully";
    }

    @Operation(
            summary = "Update Inventory Product",
            description = "Updates a record in the Inventory table"
    )
    @ApiResponses({
            @ApiResponse(responseCode = "201", description = "Inventory product updated successfully")
    })
    @PutMapping("/{sku-code}")
    @ResponseStatus(HttpStatus.OK)
    public String updateInventory(
            @PathVariable("sku-code") String skuCode,
            @RequestBody InventoryUpdate inventoryUpdate
    ) {
        inventoryService.updateInventoryProduct(skuCode, inventoryUpdate);
        return "Inventory item updated successfully";
    }

    @Operation(
            summary = "Update Inventory Product",
            description = "Updates a record in the Inventory table"
    )
    @ApiResponses({
            @ApiResponse(responseCode = "201", description = "Inventory product updated successfully")
    })
    @PatchMapping("/{sku-code}/quantity")
    @ResponseStatus(HttpStatus.OK)
    public String updateInventoryQuantity(
            @PathVariable("sku-code") String skuCode,
            @RequestBody InventoryUpdate inventoryUpdate
    ){
        inventoryService.updateInventoryQuantity(skuCode, inventoryUpdate);

        return "Inventory quantity updated successfully";
    }

    @Operation(
            summary = "Delete Inventory Product",
            description = "Deletes a record in the Inventory table"
    )
    @ApiResponses({
            @ApiResponse(responseCode = "201", description = "Inventory product deleted successfully")
    })
    @DeleteMapping("/{sku-code}/product")
    @ResponseStatus(HttpStatus.OK)
    public String deleteInventoryProduct(
            @PathVariable("sku-code") String skuCode,
            @RequestBody InventoryDelete inventoryDelete
    ){
        inventoryService.deleteInventoryProduct(skuCode);

        return "Inventory product deleted successfully";
    }



}

