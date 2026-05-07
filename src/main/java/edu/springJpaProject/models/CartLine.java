package edu.springJpaProject.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "cartline")
public class CartLine {
    @Id @Column(name = "cartlineid")
    Long cartLineID;
    @ManyToOne()
    @JoinColumn(name = "productid")
    Product product;
    Integer quantity;
    @ManyToOne()
    @JoinColumn(name = "orderid")
    Order order;

    @Override
    public String toString() {
        return "CartLine{" +
                "cartLineID=" + cartLineID +
                ", product=" + product +
                ", quantity=" + quantity +
                ", order=" + order +
                '}';
    }

    public Long getCartLineID() {
        return cartLineID;
    }

    public void setCartLineID(Long cartLineID) {
        this.cartLineID = cartLineID;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
