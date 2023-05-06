package com.arthur.demo.controller;

import com.arthur.demo.entities.Departament;
import com.arthur.demo.entities.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/Products")
public class productController {
    @GetMapping
    public List<Product> getObjects(){
        Departament d1 = new Departament(1L, "Tech");
        Departament d2 = new Departament(2L, "Pet");
        Product p1 = new Product(1,"Macbook pro", 4000.00, d1);
        Product p2 = new Product(2,"PC Gamer", 5000.00, d1);
        Product p3 = new Product(3,"Pet house", 300.00, d2);

        List<Product> list = Arrays.asList(p1,p2,p3);
        return list;
    };

}
