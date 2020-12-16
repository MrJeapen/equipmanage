package com.whut.equipmanage.controller.map;

import com.whut.equipmanage.common.ResponseBean;
import com.whut.equipmanage.common.resultBean.Order;
import com.whut.equipmanage.common.resultBean.ProcessLog;
import com.whut.equipmanage.dataobject.OrderDO;
import com.whut.equipmanage.service.OrderService;
import com.whut.equipmanage.service.ProcessLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class OrderController {

    @Autowired
    OrderService orderService;

    @RequestMapping("/allorder")
    public ResponseBean getAllOrder(@RequestParam("page") Integer page, @RequestParam("limit") Integer limit
    ){
        List<Order> orderList = orderService.commonQuery(page, limit);
        int logCount = orderService.getLogCount();
        ResponseBean responseBean = new ResponseBean();
        responseBean.setData(orderList);
        responseBean.setCount(logCount);
        System.out.println(responseBean);
        return responseBean;
    }

    @RequestMapping("/orderAdd")
    public Boolean orderAdd(@RequestParam("workerId") Integer workerId,
                                 @RequestParam("workClass") String workClass,
                                 @RequestParam("instruction") String instruction){
        System.out.println(workClass + "-- " + workerId + "--" + instruction);
        OrderDO orderDO = new OrderDO(workerId, workClass,instruction);

        //预留publisher修改
        orderDO.setPublisher(1);

        return  orderService.insertOrderDo(orderDO)>0;
    }
}
