package com.mymodule.service.impl;

import com.mymodule.dao.StudentDao;
import com.mymodule.entity.MyStudent;
import com.mymodule.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private StudentDao studentDao;

    public List<MyStudent> findalll() {
        System.out.println(11);
        List<MyStudent> lists = studentDao.findAll();
        System.out.println(lists);
        return lists;
    }
}
