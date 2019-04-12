package service;

import model.Mingxi;
import model.Order;

import java.util.List;

public interface OrderService {
    List<Order> findAll();

    List<Mingxi> orderDetail(Integer id);

    void updateByKey(Integer id);
}
