package com.whut.equipmanage.service.impl;

import com.whut.equipmanage.common.resultBean.Check;
import com.whut.equipmanage.dao.CheckDOMapper;
import com.whut.equipmanage.dao.EquipDOMapper;
import com.whut.equipmanage.dao.WorkerDOMapper;
import com.whut.equipmanage.dataobject.CheckDO;
import com.whut.equipmanage.service.CheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@Service
public class CheckServiceImpl implements CheckService {

    @Autowired
    CheckDOMapper checkDOMapper;

    @Autowired
    WorkerDOMapper workerDOMapper;

    @Autowired
    EquipDOMapper equipDOMapper;


    @Override
    public int getLogCount() {
        return checkDOMapper.getLogCount();
    }

    @Override
    public List<Check> commonQuery(Integer page, Integer limit) {

        List<Check> checkList = new ArrayList<>();
        int start = (page-1) * limit;
        SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");

        List<CheckDO> checkDOS = checkDOMapper.commonQuery(start,limit);
        for (CheckDO checkDO:checkDOS){
            Check check = new Check();
            check.setNote(checkDO.getNote());
            check.setCheckTime(format.format(checkDO.getCheckTime()));
            check.setDetailId(checkDO.getEquipId());
            check.setWorkerName(
                    workerDOMapper.selectByPrimaryKey(checkDO.getWorkerId()).getWorkerName()
            );
            check.setWorkerPhone(
                    workerDOMapper.selectByPrimaryKey(checkDO.getWorkerId()).getWorkerPhone()
            );
            check.setEquipName(
                    equipDOMapper.selectByPrimaryKey(checkDO.getEquipId()).getEquipName()
            );
            check.setEquipClass(
                    equipDOMapper.selectByPrimaryKey(checkDO.getEquipId()).getEquipClass().toString()
            );
            checkList.add(check);
        }
        return checkList;
    }
}
