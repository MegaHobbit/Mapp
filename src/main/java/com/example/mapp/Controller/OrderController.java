package com.example.mapp.Controller;


import com.example.mapp.Service.OrderService;
import com.example.mapp.dto.OrderRequest;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/order")
@RequiredArgsConstructor
@Tag(name = "Orders", description = "Order processing API")
public class OrderController {

    private final OrderService orderService;



    @Operation(summary = "Place an order", description = "Creates an order using the supplied order line items.")
    @ApiResponses({
            @ApiResponse(responseCode = "201", description = "Order placed successfully")
    })
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String placeOrder(@RequestBody OrderRequest orderRequest) {

        orderService.placeOrder(orderRequest);
        return "Order Placed Successfully";
    }
}

