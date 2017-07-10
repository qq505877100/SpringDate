package com.baidu.service;

import com.baidu.domain.Student;
import com.baidu.repository.StudentDaoCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by dell on 2017/7/3.
 */
@Service
public class StudentServiceCrudRepositoryImpl {
    @Autowired
    private StudentDaoCrudRepository studentDaoCrudRepository;

    @Transactional
    public void saveAll(List<Student> stus) {
        studentDaoCrudRepository.save(stus);

    }
}
