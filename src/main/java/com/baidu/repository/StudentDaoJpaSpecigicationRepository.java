package com.baidu.repository;

import com.baidu.domain.Student;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.RepositoryDefinition;

/**
 * Created by dell on 2017/7/3.
 */
//注意因为JpaSpecificationRepository不属于Repository体系，不能直接加给spring容器管理，要加注解
@RepositoryDefinition(domainClass = Student.class,idClass = Integer.class)
public interface StudentDaoJpaSpecigicationRepository extends JpaSpecificationExecutor<Student> {
}
