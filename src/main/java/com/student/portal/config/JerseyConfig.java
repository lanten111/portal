package com.student.portal.config;

import com.student.portal.resources.StudentResource;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import javax.ws.rs.ApplicationPath;

@Component
@ApplicationPath("api")
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig(){

        register(StudentResource.class);
    }

}
