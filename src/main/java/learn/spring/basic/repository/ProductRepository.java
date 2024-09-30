package learn.spring.basic.repository;

import learn.spring.basic.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



//Repository interface for Product entity.
@Repository
public interface ProductRepository extends JpaRepository<Product, Long>
{

}
