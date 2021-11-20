package ru.gb.service;

import ru.gb.entity.Product;

import java.util.Arrays;
import java.util.List;

public class ProductService {
    public List<Product> createListOfProducts() {
        List<Product> listOfProducts = Arrays.asList(
            new Product(1, "brush №8", 155.00),
            new Product(2, "canvas", 415.50),
            new Product(3, "linseed oil", 270.00),
            new Product(4, "subframe", 900.00),
            new Product(5, "frame", 1700.90),
            new Product(6, "gouache", 830.00),
            new Product(7, "palette knife", 670.40),
            new Product(8, "wooden palette", 1000.00),
            new Product(9, "canvas primer", 830.00),
            new Product(10, "charcoal pencil", 200.00)
        );
        return listOfProducts;
    }
}
