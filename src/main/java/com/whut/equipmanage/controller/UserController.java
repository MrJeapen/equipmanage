package com.whut.equipmanage.controller;

import com.whut.equipmanage.common.ResponseBean;
import com.whut.equipmanage.common.resultBean.SessionBean;
import com.whut.equipmanage.common.resultBean.TokenBean;
import com.whut.equipmanage.dao.AdminDOMapper;
import com.whut.equipmanage.dao.WorkerDOMapper;
import com.whut.equipmanage.dataobject.AdminDO;
import com.whut.equipmanage.dataobject.WorkerDO;
import com.whut.equipmanage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
public class UserController {


    @Autowired
    UserService userService;

    @Autowired
    WorkerDOMapper workerDOMapper;

    @Autowired
    AdminDOMapper adminDOMapper;


    @RequestMapping("/workers")
    public ResponseBean userList(){
        ResponseBean responseBean = new ResponseBean();
        List<WorkerDO> allWorkers = workerDOMapper.getAllWorkers();
        responseBean.setData(allWorkers);
        return  responseBean;
    }
//
//
    @RequestMapping("/login")
    public ResponseBean login(@RequestParam("username") String userName,
                              @RequestParam("password") String password
                              ){
        ResponseBean responseBean = new ResponseBean();
        AdminDO adminDO = adminDOMapper.selectByUserName(userName);
        if(adminDO.getPassword().equals(password)){
            String token = UUID.randomUUID().toString().replace("-", "");
            TokenBean tokenBean = new TokenBean(token);
            adminDO.setToken(token);
            // 添加token
            adminDOMapper.updateByPrimaryKey(adminDO);
            responseBean.setData(tokenBean);
            responseBean.setCount(0);
        }
        return responseBean;
    }

    @RequestMapping("/getsession")
    public ResponseBean getsession(@RequestParam("access_token") String token){
        ResponseBean responseBean = new ResponseBean();
        AdminDO adminByToken = adminDOMapper.getAdminByToken(token);
        SessionBean sessionBean = new SessionBean();
        sessionBean.setUsername(adminByToken.getAdminName());
        responseBean.setData(sessionBean);
        return responseBean;
    }

}
