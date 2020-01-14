package com.student.portal.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.sql.DataSource;

@Profile("local")
@Configuration
//@EnableJpaRepositories(basePackages = {"com.student.portal.repository"})
public class DatasourceConfig {

        @Bean
        @Primary
        @Qualifier("studentPortals")
        @ConfigurationProperties(prefix = "spring.datasource")
        public DataSource datasource(){
            return DataSourceBuilder.create().build();
        }

}
