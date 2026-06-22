package com.example.mapp.Service;

import com.example.mapp.Repositories.InventoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class InventoryService {

    private final InventoryRepository inventoryRepository;

    @Transactional(readOnly = true)
    public boolean isInStock(String skuCode){
        return inventoryRepository.findBySkuCode(skuCode)
                .map(inventory -> inventory.getQuantity() > 0)
                .orElse(false);
    }



}
