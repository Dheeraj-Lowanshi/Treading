package com.oriental.service;

import com.oriental.domain.OrderType;
import com.oriental.modal.Coin;
import com.oriental.modal.Order;
import com.oriental.modal.OrderItem;
import com.oriental.modal.User;

import java.util.List;

public interface OrderService {

    Order createOrder(User user, OrderItem orderItem, OrderType orderType);

    Order getOrderById(Long orderId) throws Exception;

    List<Order> getAllOrderOfUser(Long userId,OrderType orderType,String assetSymbol);

    Order processOrder(Coin coin,double quantity,OrderType orderType,User user) throws Exception;


}
