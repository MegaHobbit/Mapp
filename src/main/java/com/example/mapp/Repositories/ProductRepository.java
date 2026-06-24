package com.example.mapp.Repositories;

import com.example.mapp.Models.Inventory;
import com.example.mapp.Models.Products;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<Products, Long> {

    Optional<Products> findByName(String name);

    void deleteByName(String name);
}
