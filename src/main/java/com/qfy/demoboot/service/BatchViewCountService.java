package com.qfy.demoboot.service;

import com.qfy.demoboot.entity.BatchViewCount;

public interface BatchViewCountService {

    String insertSelective(BatchViewCount record);

    BatchViewCount selectByPrimaryKey(Integer id);
}
