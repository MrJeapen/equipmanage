package com.whut.equipmanage.controller.map;

import com.whut.equipmanage.common.ResponseBean;
import com.whut.equipmanage.common.resultBean.Check;
import com.whut.equipmanage.common.resultBean.DetailBean;
import com.whut.equipmanage.common.resultBean.Order;
import com.whut.equipmanage.dao.DetailDOMapper;
import com.whut.equipmanage.dataobject.DetailDO;
import com.whut.equipmanage.service.CheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CheckController {

    @Autowired
    CheckService checkService;

    @Autowired
    DetailDOMapper detailDOMapper;


    @RequestMapping("/allcheck")
    public ResponseBean getAllOrder(@RequestParam("page") Integer page,
                                    @RequestParam("limit") Integer limit
    ){
        List<Check> checkList = checkService.commonQuery(page, limit);
        int logCount = checkService.getLogCount();
        ResponseBean responseBean = new ResponseBean();
        responseBean.setData(checkList);
        responseBean.setCount(logCount);
        System.out.println(responseBean);
        return responseBean;
    }

    @RequestMapping("/detail")
    public ResponseBean getDetailById(@RequestParam("detailId") Integer id){

        ResponseBean responseBean = new ResponseBean();

        DetailDO detailDO = detailDOMapper.selectByPrimaryKey(id);
        List<DetailBean> list = new ArrayList<>();

        list.add(new DetailBean("胎压", detailDO.getTyrePressure()));
        list.add(new DetailBean("机油", detailDO.getEngineOil()));
        list.add(new DetailBean("燃油", detailDO.getOil()));
        list.add(new DetailBean("螺丝", detailDO.getScrew()));
        responseBean.setData(list);
        return  responseBean;
    }
}
