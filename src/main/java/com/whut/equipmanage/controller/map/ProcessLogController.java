package com.whut.equipmanage.controller.map;

import com.whut.equipmanage.common.ResponseBean;
import com.whut.equipmanage.common.resultBean.ProcessLog;
import com.whut.equipmanage.service.ProcessLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProcessLogController {

    @Autowired
    ProcessLogService processLogService;

    @RequestMapping("/allprocesslog")
    public ResponseBean getAllProcessLog(@RequestParam("page") Integer page,
                                         @RequestParam("limit") Integer limit){

        List<ProcessLog> processLogList = processLogService.commonquery(page, limit);


        int logCount = processLogService.getLogCount();
        ResponseBean responseBean = new ResponseBean();
        responseBean.setData(processLogList);
        responseBean.setCount(logCount);
        System.out.println(responseBean);

        return responseBean;
    }

    @RequestMapping("/orderAdd")
    public ResponseBean orderAdd(@RequestParam("workerId") Integer workerId,
                                 @RequestParam("workClass") String workClass,
                                 @RequestParam("instruction") String instruction){
        System.out.println(workClass + "-- " + workerId + "--" + instruction);
        ResponseBean responseBean = new ResponseBean();
        responseBean.setCode(100);
        return  responseBean;
    }
}
