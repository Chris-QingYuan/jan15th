package com.chrisyuan.jan15th;

import components.controller.ProductController;
import components.domain.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan("components")
@SpringBootApplication
public class Jan15thApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Jan15thApplication.class, args);
        ProductController productController = (ProductController) ctx.getBean("productController");
        Product product = productController.get(1L);

        System.out.println("result of Controller action:");
        System.out.println(product.getDescription());

        System.exit(0);
    }
}
