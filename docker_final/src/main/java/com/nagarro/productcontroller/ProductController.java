package com.nagarro.productcontroller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.docker_final.*;

@RestController
@RequestMapping("/product")
public class ProductController {
	 @GetMapping
	    public ResponseEntity<List<Product>> getAllProducts() {
	        List<Product> listOfProduct = new ArrayList<>();
	        listOfProduct.add(new Product(1, "Laptop", "Powerful laptop for all your computing needs", 1200.00));
	        listOfProduct.add(new Product(2, "Smartphone", "Latest model with advanced features", 699.99));
	        listOfProduct.add(new Product(3, "Headphones", "High-quality over-ear headphones", 149.50));

	        return ResponseEntity.ok(listOfProduct);
	    }
}
