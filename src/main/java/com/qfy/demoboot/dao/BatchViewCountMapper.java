package com.qfy.demoboot.dao;

import com.qfy.demoboot.entity.BatchViewCount;

public interface BatchViewCountMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BatchViewCount record);

    void insertSelective(BatchViewCount record);

    BatchViewCount selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BatchViewCount record);

    int updateByPrimaryKey(BatchViewCount record);
}