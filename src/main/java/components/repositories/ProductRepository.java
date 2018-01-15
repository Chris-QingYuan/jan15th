package components.repositories;


import components.domain.Product;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository {
    public Product getProduct(Long id){
        Product product = new Product();
        product.setDescription(this.getClass().getName() + "::get\nSpring controller in action!!");
        return product;
    }
}
