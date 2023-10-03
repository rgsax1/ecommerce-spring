package rodrigo.salles.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import rodrigo.salles.ecommerce.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
