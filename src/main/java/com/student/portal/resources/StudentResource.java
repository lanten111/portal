package com.student.portal.resources;

import com.student.portal.domain.Modules;
import com.student.portal.domain.Student;
import com.student.portal.repository.ModuleRepository;
import com.student.portal.repository.StudentRepository;
import com.student.portal.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/v1")
public class StudentResource {

    @Autowired
    StudentService studentService;
    @Autowired
    StudentRepository studentRepository;
    @Autowired
    ModuleRepository moduleRepository;

    @GET
    @Path("/student")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Student> getStudentList(@QueryParam("year") String year){

        return studentService.getStudentName(year);

    }

    @POST
    @Path("/add_student")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response addStudent(@RequestBody Student student) {

        studentRepository.save(student);
        return Response.ok(student).build();
    }

    @POST
    @Path("/register_module")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public void registerModule(@RequestBody Modules modules){

        moduleRepository.save(modules);
    }
}
