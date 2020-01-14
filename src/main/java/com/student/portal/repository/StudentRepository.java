package com.student.portal.repository;

import com.student.portal.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

//    @Query("select c from Student c")
    List<Student> findAllByCurrentYear(String year);

}
