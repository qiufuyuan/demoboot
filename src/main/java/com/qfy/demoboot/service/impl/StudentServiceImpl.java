package com.qfy.demoboot.service.impl;

import com.qfy.demoboot.dao.StudentMapper;
import com.qfy.demoboot.entity.Student;
import com.qfy.demoboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper dao;

    @Override
    public List<Student> getList() {
        return dao.getList();
    }
}
