package com.example.productdemo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.productdemo.entity.Product;
import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer>{
	 List<Product> findByNameContainingIgnoreCaseOrCategoryContainingIgnoreCase(
	            String name, String category);
}
