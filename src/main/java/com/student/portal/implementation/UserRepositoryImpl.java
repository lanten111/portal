//package com.student.portal.implementation;
//
//import com.student.portal.domain.User;
//import com.student.portal.repository.UserRepository;
//import org.hibernate.SessionFactory;
//import org.hibernate.query.Query;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//
//import javax.transaction.Transactional;
//
//@Repository
//@Transactional
//public class UserRepositoryImpl implements UserRepository {
//
//    @Autowired
//    private SessionFactory sessionFactory;
//
//    @Override
//    public User getUserByStudentNumber(String username){
//        Query<User> query = sessionFactory.getCurrentSession().createQuery("from User u where u.studentNumber =:username");
//        query.setParameter("username", username);
//        return query.uniqueResult();
//
//    }
//}
