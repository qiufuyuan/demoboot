package com.qfy.demoboot.service.impl;

import com.qfy.demoboot.dao.BatchViewCountMapper;
import com.qfy.demoboot.entity.BatchViewCount;
import com.qfy.demoboot.service.BatchViewCountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("batchView")
public class BatchViewCountServiceImpl implements BatchViewCountService {

    @Autowired(required = false)
    private BatchViewCountMapper dao;

    @Override
    public String insertSelective(BatchViewCount record) {
        dao.insert(record);
        System.out.println(record.getBatchId());
        return "OK";
    }

    @Override
    public BatchViewCount selectByPrimaryKey(Integer id) {
        return dao.selectByPrimaryKey(id);
    }


}
