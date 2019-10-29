package com.mymodule.test;

import com.mymodule.dao.StudentDao;
import com.mymodule.entity.MyStudent;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class TestMyStudent {

    @Autowired
    private StudentDao studentDao;

    @Test
    @Transactional
    public void testDemo(){
        //查所有
        List<MyStudent> all = studentDao.findAll();
        all.forEach(System.out::println);
        //查单行findOne
//        MyStudent one = studentDao.findOne(20L);
//        System.out.println(one);
        //查询单行getOne
//        MyStudent one = studentDao.getOne(20L);
//        System.out.println(one);
        //聚合查询
//        long count = studentDao.count();
//        System.out.println("count = " + count);
    }

    @Test
    @Transactional
    @Rollback(value = false)
    public void testJpql(){
        //查单个
//        MyStudent myStudent = studentDao.selectOne(20L);
//        System.out.println("myStudent = " + myStudent);
        //修改
        //studentDao.updateOnee(20L, "zz");
        //本地查询,sql语言
//        MyStudent myStudent = studentDao.selectOneBySql(20L);
//        System.out.println("myStudent = " + myStudent);
        //本地部分查询
       // Object[] objects = studentDao.selectPartBySql(20L);
        //System.out.println(objects instanceof Object[]);

        //命名查询
        MyStudent byId = studentDao.getById(20L);
        System.out.println("byId = " + byId);

        System.out.println("ahaa");

    }

}
