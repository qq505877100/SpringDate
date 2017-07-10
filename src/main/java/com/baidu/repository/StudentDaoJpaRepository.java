package com.baidu.repository;

import com.baidu.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by dell on 2017/7/3.
 */
public interface StudentDaoJpaRepository extends JpaRepository<Student,Integer> {
}
