package com.baidu.repository;

import com.baidu.domain.Student;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by dell on 2017/7/3.
 */
public interface StudentDaoSpringJpaImpl extends Repository<Student,Integer>{
    public List<Student> findByName(String name);

    //like
    public List<Student> findByNameStartingWithOrAgeLessThan(String name,Integer age);

    //
    public List<Student> findByNameInAndAgeLessThan(String name,Integer age);

    //自定义查询
    @Query("select o from Student o where o.id=:id")
    public Student findById(@Param("id") Integer id);

    @Modifying
    @Query("update Student o  set o.name=:name where o.id=:id")
    public void update(@Param("id")Integer id,@Param("name")String name);

    //原生SQL
    @Query(nativeQuery = true,value="select * from student where age < :age")
    public List<Student> findByAge(@Param("age")Integer age);
}
