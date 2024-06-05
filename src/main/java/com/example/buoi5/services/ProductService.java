package com.example.buoi5.services;


import com.example.buoi5.models.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductService {
    private List<Product> listProduct = new ArrayList<>();
    public ProductService(){
//        this.listProduct.add(new Product(1, "san pham 1","1.jpg",29312));
//        this.listProduct.add(new Product(2, "san pham 2","1.jpg",12345));
    }

    public void add(Product newProduct){
        listProduct.add(newProduct);
    }

    public List<Product> getAll() {
        return listProduct;
    }
    public Product get (int id) {return listProduct.stream().filter(p->p.getId()==id).findFirst().orElse(null);}
    public void edit(Product editProduct){}
}
