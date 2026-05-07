package edu.springJpaProject.repositories;

import edu.springJpaProject.models.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {
}
