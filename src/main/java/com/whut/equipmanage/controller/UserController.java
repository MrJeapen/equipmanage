package com.whut.equipmanage.controller;

import com.whut.equipmanage.common.ResponseBean;
import com.whut.equipmanage.dao.WorkerDOMapper;
import com.whut.equipmanage.dataobject.WorkerDO;
import com.whut.equipmanage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {


    @Autowired
    UserService userService;

    @Autowired
    WorkerDOMapper workerDOMapper;


    @RequestMapping("/workers")
    public ResponseBean userList(){
        ResponseBean responseBean = new ResponseBean();
        List<WorkerDO> allWorkers = workerDOMapper.getAllWorkers();
        responseBean.setData(allWorkers);
        return  responseBean;
    }

}
