package com.whut.equipmanage.service.impl;

import com.whut.equipmanage.common.resultBean.Order;
import com.whut.equipmanage.dao.OrderDOMapper;
import com.whut.equipmanage.dao.WorkerDOMapper;
import com.whut.equipmanage.dataobject.OrderDO;
import com.whut.equipmanage.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class OrderImpl implements OrderService {

    @Autowired
    OrderDOMapper orderDOMapper;

    @Autowired
    WorkerDOMapper workerDOMapper;

    @Override
    public int getLogCount() {
        return orderDOMapper.getLogCount();
    }

    @Override
    public List<Order> commonQuery(Integer page, Integer limit) {

        List<Order> orderList = new ArrayList<>();
        int start = (page-1) * limit;

        SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");

        List<OrderDO> orderDOS = orderDOMapper.commonQuery(start,limit);
        for (OrderDO orderDO: orderDOS){
            Order order = new Order(orderDO) ;
            order.setWorkerName(
                    workerDOMapper.selectByPrimaryKey(order.getWorkerId()).getWorkerName()
            );
            order.setTheInitTime(format.format(orderDO.getInitTime()));
            orderList.add(order);
        }
        return orderList;
    }

    @Override
    public int insertOrderDo(OrderDO orderDO) {
        orderDO.setInitTime(new Date());
        return orderDOMapper.insert(orderDO);
    }
}
