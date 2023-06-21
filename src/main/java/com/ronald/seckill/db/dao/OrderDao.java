package com.ronald.seckill.db.dao;


import com.ronald.seckill.db.po.Order;

public interface OrderDao {
    void insertOrder(Order order);
    Order queryOrder(String orderNo);
    void updateOrder(Order order);
}
