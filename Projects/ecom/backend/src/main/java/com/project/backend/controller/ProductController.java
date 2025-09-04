package com.project.backend.controller;

import com.project.backend.model.Product;
import com.project.backend.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:5173")
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping("/products")
    public ResponseEntity<List<Product>> getAllProducts() {
        return new ResponseEntity<>( service.getAllProducts(), HttpStatus.OK );
    }

    @GetMapping("/products/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable int id) {
        Product product = service.getProductById( id );

        if(product !=null) {
            return new ResponseEntity<>( product, HttpStatus.OK );
        } else {
            return new ResponseEntity<>( HttpStatus.NOT_FOUND );
        }

    }

    @GetMapping("product/{productId}/image")
    public ResponseEntity<byte[]> getImageById(@PathVariable int productId) {
       Product product = service.getProductById( productId );
        if(product !=null) {
            return new ResponseEntity<>( product.getImageData(), HttpStatus.OK );
        } else {
            return new ResponseEntity<>( HttpStatus.NOT_FOUND );
        }
    }

    @PostMapping("product")
    public ResponseEntity<?> addProduct(@RequestPart Product product, @RequestPart MultipartFile imageFile) {
        Product product1 = null;
        try {
            product1 = service.addOrUpdateProduct(product, imageFile);
            return new ResponseEntity<>(product1, HttpStatus.CREATED);
        } catch (IOException e) {
            return new ResponseEntity<>( e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR );
        }
    }

    @PutMapping("./product/{id}")
    public ResponseEntity<String> updateProduct(@PathVariable int id, @RequestBody Product product, @RequestPart MultipartFile imageFile) {
        Product updatedProduct = null;

        try {
            updatedProduct = service.addOrUpdateProduct(product, imageFile);
            return new ResponseEntity<>( "Updated", HttpStatus.OK );
        } catch (IOException e){
            return new ResponseEntity<>( e.getMessage(), HttpStatus.BAD_REQUEST );
        }
    }

    @DeleteMapping("/product/{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable int id) {
         Product product = service.getProductById( id );
         if(product != null) {
             service.deleteProduct( id );
             return new ResponseEntity<>( "Deleted", HttpStatus.OK );
         } else {
             return new ResponseEntity<>( HttpStatus.NOT_FOUND );
         }
    }

    @GetMapping("product/search/")
    public ResponseEntity<List<Product>> searchProducts(@RequestParam String keyword) {
        List<Product> products = service.searchProducts(keyword);
        System.out.println("Searching with: " + keyword);
        return new ResponseEntity<>( products, HttpStatus.OK  );
    }


}
