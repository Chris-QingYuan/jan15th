package components.service;

import components.domain.Product;
import components.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Qing (Chris) Yuan on Jan/15/2018 6:23 PM
 */
@Service
public class ProductServiceImpl implements ProductService {


    private ProductRepository productRepository;

    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    /**
     * @param id
     * @return
     */
    @Override
    public Product getProduct(Long id) {
        return productRepository.getProduct(id);
    }

    @Override
    public List<Product> listProducts() {
        System.out.println(this.getClass().getName() + " injected");
        ArrayList<Product> products = new ArrayList(2);
        products.add(new Product("this is 1st product."));
        products.add(new Product("this is 2st product."));
        return products;
    }
}
