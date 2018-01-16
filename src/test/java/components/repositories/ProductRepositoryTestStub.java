package components.repositories;

import components.domain.Product;

/**
 * Created by Qing (Chris) Yuan on Jan/16/2018 1:35 AM
 */
public class ProductRepositoryTestStub implements ProductRepository {

    @Override
    public Product getProduct(Long id) {
        Product product = new Product();
        product.setDescription("Spring controller in action!!");
        return product;
    }
}
