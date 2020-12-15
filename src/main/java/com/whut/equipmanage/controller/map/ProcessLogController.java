package com.whut.equipmanage.controller.map;

import com.whut.equipmanage.common.ResponseBean;
import com.whut.equipmanage.common.resultBean.ProcessLog;
import com.whut.equipmanage.service.ProcessLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProcessLogController {

    @Autowired
    ProcessLogService processLogService;

    @RequestMapping("/allprocesslog")
    public ResponseBean getInTimeLocation(){

        List<ProcessLog> processLogList = processLogService.commonquery();

        System.out.println(processLogList.toString());

        ResponseBean responseBean = new ResponseBean();
        responseBean.setData(processLogList);

        System.out.println(responseBean);

        return responseBean;
    }
}
