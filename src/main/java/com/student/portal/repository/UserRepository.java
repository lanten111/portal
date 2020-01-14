package com.student.portal.repository;

import com.student.portal.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, String> {

    User getUserByStudentNumber(String studentNumber);
}
