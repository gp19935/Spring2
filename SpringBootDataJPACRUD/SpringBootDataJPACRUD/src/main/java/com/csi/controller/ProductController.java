package com.csi.controller;

import com.csi.model.Product;
import com.csi.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class ProductController {

    @Autowired
    ProductServiceImpl productServiceImpl;

    @GetMapping
    public ResponseEntity<String> sayHello(){
        return ResponseEntity.ok("WELCOME TO REACT JS PUNE");
    }

    @GetMapping("/welcome")
    public ResponseEntity<String> sayWELCOME(){
        return ResponseEntity.ok("INFOSYS");
    }

    @GetMapping("/getdata")
    public List<Product> getAllData(){
        return productServiceImpl.getAllData();
    }

    @PostMapping("/savedata")
    public Product saveData(@RequestBody Product product){
        return productServiceImpl.saveData(product);
    }

    @PutMapping("/updatedata/{productId}")
    public Product updateData(@PathVariable int productId, @RequestBody Product product){
       //
        //

        return productServiceImpl.updateData(product);
    }

    @DeleteMapping("/deletedata/{productId}")
    public String deleteData(@PathVariable int productId){
        productServiceImpl.deleteData(productId);
        return "Product Data Deleted Successfully";
    }


}
