package components.test.config;

import components.repositories.ProductRepository;
import components.repositories.ProductRepositoryImpl;
import components.service.ProductService;
import components.service.ProductServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Qing (Chris) Yuan on Jan/16/2018 1:49 AM
 */
@Configuration
public class ProductServiceTestConfig {

    @Bean
    public ProductService productService(){
        return new ProductServiceImpl();
    }

    @Bean
    public ProductRepository productRepository(){
        return new ProductRepositoryImpl();
    }
}
