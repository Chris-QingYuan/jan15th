package components.service;

import components.domain.Product;

import java.util.List;

/**
 * Created by Qing (Chris) Yuan on Jan/15/2018 6:20 PM
 */
public interface ProductService {
    Product getProduct(Long id);

    List<Product> listProducts();
}
