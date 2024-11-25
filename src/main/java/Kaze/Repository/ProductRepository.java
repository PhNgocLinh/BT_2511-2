package Kaze.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Kaze.Entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
