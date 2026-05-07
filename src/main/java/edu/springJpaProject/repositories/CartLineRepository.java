package edu.springJpaProject.repositories;

import edu.springJpaProject.models.CartLine;
import edu.springJpaProject.models.Order;
import org.springframework.data.repository.CrudRepository;

public interface CartLineRepository extends CrudRepository<CartLine, Long> {
    public Iterable<CartLine> FindByOrder(Order order);
}
