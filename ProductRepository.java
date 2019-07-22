package com.myRetail.restapi.repositories;

import org.springframework.data.repository.CrudRepository;

import com.myRetail.restapi.domain.Product;

/**
 *
 * @author Rohit Kanwar
 * <p>A simple mongo db repository</p>
 */
public interface ProductRepository extends CrudRepository<Product, String> {
    @Override
    Product findOne(String id);

}
