package com.student.portal.dao;

import com.student.portal.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;

import javax.sql.DataSource;
import java.sql.*;

public class StudentDao {

    @Autowired
    private DataSource dataSource;

    public StudentDao(DataSource dataSource){
        this.dataSource = dataSource;
    }

    public Student InsertStudent(String name, String surname, String studentNumber, String idNumber, String year) throws SQLException {

        Connection connection = dataSource.getConnection();
        connection.setAutoCommit(false);

        PreparedStatement preparedStatement = connection.prepareStatement("INSERT into public.student (name, surname, student_number, id_number, current_year, timestamp) VALUES (?,?,?,?,?,?)");
        preparedStatement.setString(1,name);
        preparedStatement.setString(2,surname);
        preparedStatement.setString(3,studentNumber);
        preparedStatement.setString(4,idNumber);
        preparedStatement.setString(5,year);
        preparedStatement.setTimestamp(6, new Timestamp(System.currentTimeMillis()));
        preparedStatement.close();
        connection.close();

        return null;

    }
}
