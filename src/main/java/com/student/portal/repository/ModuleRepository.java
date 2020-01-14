package com.student.portal.repository;

import com.student.portal.domain.Modules;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModuleRepository extends JpaRepository<Modules, String> {

}
