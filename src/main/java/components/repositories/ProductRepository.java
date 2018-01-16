package components.repositories;


import components.domain.Product;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository {
    public Product getProduct(Long id);
}
