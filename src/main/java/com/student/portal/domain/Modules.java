package com.student.portal.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "modules")
public class Modules {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "module_name_1")
    private String moduleName1;

    @Column(name = "module_name_2")
    private String moduleName2;

    @Column(name = "module_name_3")
    private String moduleName3;

    @Column(name = "module_name_4")
    private String moduleName4;

    @Column(name = "module_name_5")
    private String moduleName5;

    @Column(name = "module_name_6")
    private String moduleName6;

    @Column(name = "student_number")
    private String studentNumber;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModuleName1() {
        return moduleName1;
    }

    public void setModuleName1(String moduleName1) {
        this.moduleName1 = moduleName1;
    }

    public String getModuleName2() {
        return moduleName2;
    }

    public void setModuleName2(String moduleName2) {
        this.moduleName2 = moduleName2;
    }

    public String getModuleName3() {
        return moduleName3;
    }

    public void setModuleName3(String moduleName3) {
        this.moduleName3 = moduleName3;
    }

    public String getModuleName4() {
        return moduleName4;
    }

    public void setModuleName4(String moduleName4) {
        this.moduleName4 = moduleName4;
    }

    public String getModuleName5() {
        return moduleName5;
    }

    public void setModuleName5(String moduleName5) {
        this.moduleName5 = moduleName5;
    }

    public String getModuleName6() {
        return moduleName6;
    }

    public void setModuleName6(String moduleName6) {
        this.moduleName6 = moduleName6;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }
}
