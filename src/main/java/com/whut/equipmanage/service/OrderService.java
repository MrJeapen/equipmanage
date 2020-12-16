package com.whut.equipmanage.service;

import com.whut.equipmanage.common.resultBean.Order;
import com.whut.equipmanage.dataobject.OrderDO;

import java.util.List;

public interface OrderService {

    int getLogCount();

    List<Order> commonQuery (Integer page, Integer limit);

    int insertOrderDo (OrderDO orderDO);
}
