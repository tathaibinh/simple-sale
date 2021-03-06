package com.salestock.saleass.ui.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.salestock.common.rest.RestControllerBase;
import com.salestock.saleass.core.product.Product;
import com.salestock.saleass.core.product.ProductService;

@RestController @RequestMapping("/api/product")
class ProductController extends RestControllerBase<Product> {
    @Autowired
    ProductController(ProductService service) {
        super(service);
    }
}
