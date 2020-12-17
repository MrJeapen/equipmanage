package com.whut.equipmanage.controller.map;

import com.whut.equipmanage.common.ResponseBean;
import com.whut.equipmanage.common.resultBean.Check;
import com.whut.equipmanage.common.resultBean.DetailBean;
import com.whut.equipmanage.common.resultBean.Order;
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
        List<DetailBean> list = new ArrayList<>();

        list.add(new DetailBean("胎压", "正常"));
        list.add(new DetailBean("胎压", "正常"));
        list.add(new DetailBean("胎压", "正常"));
        list.add(new DetailBean("胎压", "正常"));
        responseBean.setData(list);
        return  responseBean;
    }
}
