package com.example.mapp.Controller;

import com.example.mapp.Service.InventoryService;
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
    public boolean isInStock(@PathVariable("sku-code") String skuCode){

        return inventoryService.isInStock(skuCode);
    }
}
