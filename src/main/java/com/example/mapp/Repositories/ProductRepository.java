package com.example.mapp.Repositories;

import com.example.mapp.Models.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Products, String> {
}
