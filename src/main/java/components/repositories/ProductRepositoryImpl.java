package components.repositories;

import components.domain.Product;

/**
 * Created by Qing (Chris) Yuan on Jan/16/2018 1:21 AM
 */
public class ProductRepositoryImpl implements ProductRepository {

    @Override
    public Product getProduct(Long id) {
        Product product = new Product();
        product.setDescription(this.getClass().getName() + "::get\nSpring controller in action!!");
        return product;
    }
}
