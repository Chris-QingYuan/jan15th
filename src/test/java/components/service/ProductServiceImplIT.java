package components.service;

import components.domain.Product;
import components.repositories.ProductRepositoryTestStub;
import components.test.config.ProductServiceTestConfig;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

/**
 * Created by Qing (Chris) Yuan on Jan/16/2018 1:27 AM
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ProductServiceTestConfig.class})
public class ProductServiceImplIT {
    private ProductService productService;

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @Test
    public void testGetProduct(){
        Product product = productService.getProduct(23L);
        assertEquals(product.getDescription(),"Spring controller in action!!");
    }
}
