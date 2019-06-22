package com.zendron.demobddtdd.services;

import com.zendron.demobddtdd.CurrencyRules;
import com.zendron.demobddtdd.jpa.ProductRepository;
import com.zendron.demobddtdd.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    @RequestMapping("/products")
    public List<Product> getAllSellers() {
        List<Product> listOfProducts = new ArrayList<>();

        Iterable<Product> list = productRepository.findAll();

        list.forEach(listOfProducts::add);

        //list.forEach(p -> new Product(p.getId(), p.getName(), new CurrencyRules().applyDiscount(p.getPrice())));

        return listOfProducts;
    }

    @RequestMapping("/ping")
    public String ping() {
        return "pong";
    }


}
