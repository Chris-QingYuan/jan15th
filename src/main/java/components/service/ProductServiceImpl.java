package components.service;

import components.domain.Product;
import components.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
     *
     * @param id
     * @return
     */
    @Override
    public Product getProduct(Long id) {
        return productRepository.getProduct(id);
    }
}
