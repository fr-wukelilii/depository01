package com.mymodule.dao;

import com.mymodule.entity.MyStudent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface StudentDao extends JpaRepository<MyStudent,Long>,JpaSpecificationExecutor<MyStudent>{

    @Query("from MyStudent where id = ?")
    public MyStudent selectOne(Long id);

    @Query("update MyStudent set name=?2 where id=?1")
    @Modifying
    public void updateOnee(Long id,String name);

    @Query(value = "select * from MyStudent where id = ?",nativeQuery = true)
    public MyStudent selectOneBySql(Long id);

    @Query(value = "select id,name from MyStudent where id = ?",nativeQuery = true)
    public Object[] selectPartBySql(Long id);

    public MyStudent getById(Long id);

}
