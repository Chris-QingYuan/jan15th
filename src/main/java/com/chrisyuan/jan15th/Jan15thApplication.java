package com.chrisyuan.jan15th;

import components.controller.ProductController;
import components.domain.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.List;


@ComponentScan("components")
@SpringBootApplication
public class Jan15thApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Jan15thApplication.class, args);
        ProductController productController = (ProductController) ctx.getBean("productController");
        List<Product> products = productController.getProducts();

        for(Product p : products){
            System.out.println(p.getDescription());
        }

        System.exit(0);
    }
}
