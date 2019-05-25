package com.qfy.demoboot.controller;

import com.qfy.demoboot.entity.Student;
import com.qfy.demoboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

@RestController
@RequestMapping("/mydb")
public class DbController {

    @Resource
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private StudentService studentService;
    @RequestMapping("/getUsers")
    public List<Map<String, Object>> getDbType(){
        String sql = "select * from student";
        List<Map<String, Object>> list =  jdbcTemplate.queryForList(sql);
        for (Map<String, Object> map : list) {
            Set<Map.Entry<String, Object>> entries = map.entrySet( );
            if(entries != null) {
                Iterator<Map.Entry<String, Object>> iterator = entries.iterator( );
                while(iterator.hasNext( )) {
                    Map.Entry<String, Object> entry =(Map.Entry<String, Object>) iterator.next( );
                    Object key = entry.getKey( );
                    Object value = entry.getValue();
                    System.out.println(key+":"+value);
                }
            }
        }
        return list;
    }

    @GetMapping("/getList")
    public List<Student> getList(){
        List<Student> list = studentService.getList();
        return list;
    }


}
