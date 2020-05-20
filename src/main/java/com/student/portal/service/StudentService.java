package com.student.portal.service;

import com.student.portal.domain.Student;
import com.student.portal.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

@Service
public interface StudentService {

    List<Student> getStudents();
    Optional<Student> getStudent(long id);
}
