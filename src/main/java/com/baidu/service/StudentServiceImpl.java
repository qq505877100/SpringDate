package com.baidu.service;

import com.baidu.repository.StudentDaoSpringJpaImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Created by dell on 2017/7/3.
 */
@Service
public class StudentServiceImpl {
    @Autowired
    private StudentDaoSpringJpaImpl studentDaoSpringJpa;

    public StudentDaoSpringJpaImpl getStudentDaoSpringJpa() {
        return studentDaoSpringJpa;
    }

    public void setStudentDaoSpringJpa(StudentDaoSpringJpaImpl studentDaoSpringJpa) {
        this.studentDaoSpringJpa = studentDaoSpringJpa;
    }

    @Transactional
    public void update(Integer id,String name) {
        studentDaoSpringJpa.update(id,name);
    }
}
