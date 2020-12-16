package com.whut.equipmanage.service;

import org.springframework.stereotype.Service;

import java.util.List;


public interface ProcessLogService {

    //返回data需要的process log对象
    List<com.whut.equipmanage.common.resultBean.ProcessLog> commonquery(Integer page, Integer limit);
    int getLogCount();
}
