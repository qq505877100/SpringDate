package com.baidu.service;

import com.baidu.domain.Student;
import com.baidu.repository.StudentDaoPagingAndSortingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by dell on 2017/7/3.
 */
@Service
public class StudentServicePagingAndSortingRepositoryImpl {

    @Autowired
    private StudentDaoPagingAndSortingRepository studentDaoPagingAndSortingRepository;

    public List<Student> findAll(Pageable pageable) {

        Page<Student> stus = studentDaoPagingAndSortingRepository.findAll(pageable);
        return stus.getContent();
    }
}
