package com.whut.equipmanage.controller;

import com.whut.equipmanage.common.ResponseBean;
import com.whut.equipmanage.dao.UserDOMapper;
import com.whut.equipmanage.dataobject.UserDO;
import com.whut.equipmanage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserDOMapper userDOMapper;
    @Autowired
    UserService userService;

    @RequestMapping("/users")
    public ResponseBean userList(@RequestParam("page") int page,
                                 @RequestParam("limit") int limit){

        List<UserDO> userDOS = userService.selectByPage(page, limit);
        ResponseBean responseBean = new ResponseBean();
        responseBean.setData(userDOS);
        responseBean.setCode(0);
        responseBean.setCount(userDOMapper.countUser());
        responseBean.setMsg("ok");
        return responseBean;
    }

}
