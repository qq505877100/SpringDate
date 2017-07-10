package com.baidu.repository;

import com.baidu.domain.Student;
import org.hibernate.type.IntegerType;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by dell on 2017/7/3.
 */
public interface StudentDaoCrudRepository extends CrudRepository<Student,Integer>{
}
