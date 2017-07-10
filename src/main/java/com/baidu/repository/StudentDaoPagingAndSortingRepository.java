package com.baidu.repository;

import com.baidu.domain.Student;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by dell on 2017/7/3.
 */
public interface StudentDaoPagingAndSortingRepository extends PagingAndSortingRepository<Student,Integer> {
}
