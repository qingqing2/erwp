package service.impl;

import dao.GoodsMapper;
import dao.MingxiMapper;
import dao.OrderMapper;
import model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import service.OrderService;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private MingxiMapper mingxiMapper;

    @Autowired
    private GoodsMapper goodsMapper;

    @Override
    public List<Order> findAll() {
        OrderExample example = new OrderExample();
        example.createCriteria();
        List<Order> orders = orderMapper.selectByExample(example);
        return orders;
    }

    @Override
    public List<Mingxi> orderDetail(Integer id) {
        List<Mingxi> list = new ArrayList<>();
        MingxiExample example = new MingxiExample();
        example.createCriteria().andOrderidEqualTo(id);
        List<Mingxi> mingxis = mingxiMapper.selectByExample(example);
        if (CollectionUtils.isEmpty(mingxis)) {
            return list;
        }
        for (Mingxi mingxi : mingxis) {
            Goods goods = goodsMapper.selectByPrimaryKey(mingxi.getGoodsid());
            mingxi.setMingcheng(goods.getMingcheng());
            mingxi.setTejia(goods.getTejia());
            list.add(mingxi);
        }
        return list;
    }

    @Override
    public void updateByKey(Integer id) {
        Order order = new Order();
        order.setId(id);
        order.setZt("已受理");
        orderMapper.updateByPrimaryKeySelective(order);
    }
}
