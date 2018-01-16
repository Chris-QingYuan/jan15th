package components.controller;


import components.domain.Product;
import components.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class ProductController {

    private ProductService productService;

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    public Product get(Long id){
        return productService.getProduct(id);
    }

    public List<Product> getProducts(){
        return productService.listProducts();
    }


}
