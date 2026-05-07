package edu.springJpaProject.components;


import edu.springJpaProject.models.CartLine;
import edu.springJpaProject.models.Order;
import edu.springJpaProject.repositories.CartLineRepository;
import edu.springJpaProject.repositories.OrderRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@AllArgsConstructor
public class MyBean {
    OrderRepository orderRepository;
    CartLineRepository cartLineRepository;

    @Transactional
    public void test(){
        List<Order> orders = new ArrayList<>();
        orderRepository.findAll().forEach(orders::add);
        List<CartLine> cartLines = new ArrayList<>();
        cartLineRepository.findAll().forEach(cartLines::add);
//        Order order1 = orderRepository.findById((long) 1).orElse(null);
//        System.out.println(order1);
//        Order order2 = cartLineRepository.findById((long) 1).orElse(new CartLine()).getOrder();
//        System.out.println(order2);
        CartLine cartLine1 = cartLines.get(0);
        System.out.println(cartLine1);
        CartLine cartLine2 = orders.get(2).getCartLines().get(0);
        System.out.println(cartLine2);
        System.out.println(cartLine1==cartLine2);
    }
}
