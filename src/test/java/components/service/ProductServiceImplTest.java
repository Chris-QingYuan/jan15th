package components.service;

import components.domain.Product;
import components.repositories.ProductRepositoryTestStub;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Qing (Chris) Yuan on Jan/16/2018 1:27 AM
 */
public class ProductServiceImplTest {
    private ProductServiceImpl productService;

    @Before
    public void setup(){
        productService = new ProductServiceImpl();
        productService.setProductRepository(new ProductRepositoryTestStub());
    }

    @Test
    public void testGetProduct(){
        Product product = productService.getProduct(23L);
        assertEquals(product.getDescription(),"Spring controller in action!!");
    }
}
