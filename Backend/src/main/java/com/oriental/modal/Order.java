package com.oriental.modal;


import com.oriental.domain.OrderStatus;
import com.oriental.domain.OrderType;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private User user;


    @Column(nullable = false)
    private OrderType orderType;

    @Column(nullable = false)
    private BigDecimal price;

    private LocalDateTime timeStap=LocalDateTime.now();

    @Column(nullable = false)
    private OrderStatus status;

    @OneToOne(mappedBy = "order",cascade = CascadeType.ALL)
    private OrderItem orderItem;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public OrderType getOrderType() {
        return orderType;
    }

    public void setOrderType(OrderType orderType) {
        this.orderType = orderType;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public LocalDateTime getTimeStap() {
        return timeStap;
    }

    public void setTimeStap(LocalDateTime timeStap) {
        this.timeStap = timeStap;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public OrderItem getOrderItem() {
        return orderItem;
    }

    public void setOrderItem(OrderItem orderItem) {
        this.orderItem = orderItem;
    }
}
