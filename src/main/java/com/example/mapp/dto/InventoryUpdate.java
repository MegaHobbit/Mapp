package com.example.mapp.dto;

import com.example.mapp.Models.Inventory;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InventoryUpdate {

    private Integer quantity;
    private String skuCode;

    public static InventoryUpdate toData(Inventory inventoryUpdate) {
        InventoryUpdate inventoryUpdate1 = new InventoryUpdate();
        inventoryUpdate1.setQuantity(inventoryUpdate.getQuantity());
        inventoryUpdate1.setSkuCode(inventoryUpdate.getSkuCode());
        return inventoryUpdate1;
    }

    public static Inventory fromData(InventoryUpdate inventoryUpdate) {
        Inventory inventoryUpdate1 = new Inventory();
        inventoryUpdate1.setQuantity(inventoryUpdate.getQuantity());
        return inventoryUpdate1;
    }

}
