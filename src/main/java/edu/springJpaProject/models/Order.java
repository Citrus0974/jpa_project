package edu.springJpaProject.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "Orders")
public class Order {
    @Id
    Long orderID;
    String name;
    @Column(name = "Adressline1")
    String adressLine1;
    @Column(name = "Adressline2")
    String adressLine2;
    @Column(name = "Adressline3")
    String adressLine3;
    String city;
    String country;
    @Column(name = "Giftwrap")
    Boolean giftWrap;
    Boolean shipped;
    @OneToMany(mappedBy = "order", fetch = FetchType.EAGER)
    List<CartLine> cartLines;

    public Long getOrderID() {
        return orderID;
    }

    public void setOrderID(Long orderID) {
        this.orderID = orderID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdressLine1() {
        return adressLine1;
    }

    public void setAdressLine1(String adressLine1) {
        this.adressLine1 = adressLine1;
    }

    public String getAdressLine2() {
        return adressLine2;
    }

    public void setAdressLine2(String adressLine2) {
        this.adressLine2 = adressLine2;
    }

    public String getAdressLine3() {
        return adressLine3;
    }

    public void setAdressLine3(String adressLine3) {
        this.adressLine3 = adressLine3;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Boolean getGiftWrap() {
        return giftWrap;
    }

    public void setGiftWrap(Boolean giftWrap) {
        this.giftWrap = giftWrap;
    }

    public Boolean getShipped() {
        return shipped;
    }

    public void setShipped(Boolean shipped) {
        this.shipped = shipped;
    }

    public List<CartLine> getCartLines() {
        return cartLines;
    }

    @Override
    public String toString() {
        List<Long> cartLineIDs = new ArrayList<>();
        cartLines.forEach((x)->cartLineIDs.add(x.getCartLineID()));
        return "Order{" +
                "orderID=" + orderID +
                ", name='" + name + '\'' +
                ", adressLine1='" + adressLine1 + '\'' +
                ", adressLine2='" + adressLine2 + '\'' +
                ", adressLine3='" + adressLine3 + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", giftWrap=" + giftWrap +
                ", shipped=" + shipped +
                ", cartlines={" + cartLines.size() +", " + cartLineIDs + "}" +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Order order)) return false;
        return Objects.equals(orderID, order.orderID) && Objects.equals(name, order.name) && Objects.equals(adressLine1, order.adressLine1) && Objects.equals(adressLine2, order.adressLine2) && Objects.equals(adressLine3, order.adressLine3) && Objects.equals(city, order.city) && Objects.equals(country, order.country) && Objects.equals(giftWrap, order.giftWrap) && Objects.equals(shipped, order.shipped);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderID, name, adressLine1, adressLine2, adressLine3, city, country, giftWrap, shipped);
    }


}
