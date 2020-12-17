package com.whut.equipmanage.service;

import com.whut.equipmanage.common.resultBean.Check;
import com.whut.equipmanage.common.resultBean.Order;

import java.util.List;

public interface CheckService {

    int getLogCount();

    List<Check> commonQuery (Integer page, Integer limit);
}
