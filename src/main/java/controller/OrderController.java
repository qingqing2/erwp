package controller;

import model.Mingxi;
import model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import service.OrderService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping("/orderMana")
    public String orderMana(HttpServletRequest request) {
        List<Order> all = orderService.findAll();
        request.setAttribute("orderList", all);
        return "/admin/order/orderMana";
    }

    @RequestMapping("/orderDetail")
    public String orderDetail(Integer id, HttpServletRequest request) {
        List<Mingxi> list = orderService.orderDetail(id);
        request.setAttribute("mingxiList", list);
        return "/admin/order/orderDetail";
    }

    @RequestMapping("/orderShouli")
    public String orderShouli(Integer id, HttpServletRequest request) {
        orderService.updateByKey(id);
        List<Order> all = orderService.findAll();
        request.setAttribute("orderList", all);
        return "/admin/order/orderMana";
    }
}
