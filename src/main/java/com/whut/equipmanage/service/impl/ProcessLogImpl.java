package com.whut.equipmanage.service.impl;

import com.whut.equipmanage.dao.EquipDOMapper;
import com.whut.equipmanage.dao.ProcessLogDOMapper;
import com.whut.equipmanage.dao.WorkerDOMapper;
import com.whut.equipmanage.dataobject.ProcessLogDO;
import com.whut.equipmanage.service.ProcessLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProcessLogImpl implements ProcessLogService {

    @Autowired
    ProcessLogDOMapper processLogDOMapper;

    @Autowired
    EquipDOMapper equipDOMapper;

    @Autowired
    WorkerDOMapper workerDOMapper;

    @Override
    public List<com.whut.equipmanage.common.resultBean.ProcessLog> commonquery(Integer page, Integer limit) {

        List<com.whut.equipmanage.common.resultBean.ProcessLog> processLogList = new ArrayList<>();
        int start = (page-1) * limit;

        List<ProcessLogDO> processLogDOS =processLogDOMapper.commonQuery(start, limit);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
        for (ProcessLogDO processLogDO :processLogDOS){
            com.whut.equipmanage.common.resultBean.ProcessLog processLog=new com.whut.equipmanage.common.resultBean.ProcessLog();
            processLog.setOriderId(processLogDO.getEquipId().longValue());
            processLog.setStartTime(format.format(processLogDO.getTimeStart()));
            processLog.setEndTime(format.format(processLogDO.getTimeEnd()));
            processLog.setNote(processLogDO.getNote());
            processLog.setWorkName(
                    workerDOMapper.selectByPrimaryKey(processLogDO.getWorkerId()).getWorkerName()
            );
            processLog.setEquipName(
                    equipDOMapper.selectByPrimaryKey(processLogDO.getEquipId()).getEquipName()
            );
            processLogList.add(processLog);
        }

        return processLogList;
    }

    @Override
    public int getLogCount() {


        return processLogDOMapper.getLogCount();

    }
}
