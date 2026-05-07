package edu.springJpaProject;

import edu.springJpaProject.components.MyBean;
import edu.springJpaProject.models.CartLine;
import edu.springJpaProject.models.Order;
import edu.springJpaProject.repositories.CartLineRepository;
import edu.springJpaProject.repositories.OrderRepository;
import edu.springJpaProject.repositories.ProductRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        System.out.println("jpa");
        ApplicationContext ctx = SpringApplication.run(Main.class, args);
        OrderRepository orderRepository = ctx.getBean(OrderRepository.class);
        orderRepository.findAll().forEach(System.out::println);
        ProductRepository productRepository = ctx.getBean(ProductRepository.class);
        productRepository.findAll().forEach(System.out::println);
        CartLineRepository cartLineRepository = ctx.getBean(CartLineRepository.class);
        cartLineRepository.findAll().forEach(System.out::println);

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
        MyBean myBean = ctx.getBean(MyBean.class);
        myBean.test();
        //написать приложение оперирующее с базой
    }
}