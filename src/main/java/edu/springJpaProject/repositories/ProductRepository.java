package edu.springJpaProject.repositories;

import edu.springJpaProject.models.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
