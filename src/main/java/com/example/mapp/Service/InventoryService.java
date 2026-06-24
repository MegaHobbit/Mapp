package com.example.mapp.Service;

import com.example.mapp.Models.Inventory;
import com.example.mapp.Repositories.InventoryRepository;
import com.example.mapp.dto.InventoryRequest;
import com.example.mapp.dto.InventoryUpdate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Slf4j
public class InventoryService {

    private final InventoryRepository inventoryRepository;


    public InventoryService(InventoryRepository inventoryRepository) {
        this.inventoryRepository = inventoryRepository;

    }

    @Transactional(readOnly = true)
    public boolean isInStock(String skuCode){
        return inventoryRepository.findBySkuCode(skuCode)
                .map(inventory -> inventory.getQuantity() > 0)
                .orElse(false);
    }

    @Transactional
    public void createInventoryProduct(InventoryRequest inventoryRequest){
        Inventory inventory = new Inventory();
        inventory.setSkuCode(inventoryRequest.getSkuCode());
        inventory.setQuantity(inventoryRequest.getQuantity());

        inventoryRepository.save(inventory);

    }

    @Transactional
    public void updateInventoryProduct(String skuCode,InventoryUpdate inventoryUpdate){

        Inventory inventory = inventoryRepository.findBySkuCode(skuCode)
                .orElseThrow(() -> new RuntimeException("Inventory item not found with SKU: " + skuCode));

        inventory.setQuantity(inventoryUpdate.getQuantity());
        inventory.setSkuCode(inventoryUpdate.getSkuCode());

        inventoryRepository.save(inventory);
    }

    @Transactional
    public void updateInventoryQuantity(String skuCode,InventoryUpdate inventoryUpdate){

        Inventory inventory = inventoryRepository.findBySkuCode(skuCode)
                .orElseThrow(() -> new RuntimeException("Inventory item not found with SKU: " + skuCode));

        inventory.setQuantity(inventoryUpdate.getQuantity());

        inventoryRepository.save(inventory);
    }

    @Transactional
    public void deleteInventoryProduct(String skuCode){

        Inventory inventory = inventoryRepository.findBySkuCode(skuCode)
                .orElseThrow(() -> new RuntimeException("Inventory item not found with SKU: " + skuCode));

        inventory.setDeletedFlag(true);
        inventoryRepository.save(inventory);

    }


}