package com.whut.equipmanage.controller.map;

import com.whut.equipmanage.common.ResponseBean;
import com.whut.equipmanage.common.resultBean.DetailBean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CheckController {

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
