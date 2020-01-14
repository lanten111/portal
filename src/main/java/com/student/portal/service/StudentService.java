package com.student.portal.service;

import com.student.portal.dao.StudentDao;
import com.student.portal.domain.Student;
import com.student.portal.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.SQLException;
import java.util.List;

@Component
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public List<Student> getStudentName(String year){

        return studentRepository.findAllByCurrentYear(year);
    }

    public Student InsertStudent(String name, String surname, String studentNumber, String idNumber, String year) throws SQLException {

//        StudentDao studentDao = new StudentDao();
//        return studentDao.InsertStudent(name, surname, studentNumber, idNumber, year);
        return null;
    }

    
}
