package com.whut.equipmanage.service;

import com.whut.equipmanage.dataobject.UserDO;

import java.util.List;

public interface UserService {

    List<UserDO> selectByPage(int page, int limit);
}
