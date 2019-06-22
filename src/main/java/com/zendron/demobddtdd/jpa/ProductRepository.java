package com.zendron.demobddtdd.jpa;

import com.zendron.demobddtdd.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {

}
