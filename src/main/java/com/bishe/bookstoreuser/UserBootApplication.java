package com.bishe.bookstoreuser;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import javax.sql.DataSource;
import java.sql.SQLException;

@SpringBootApplication
@MapperScan(basePackages = {"com.bishe.bookstoreuser.dao"})
public class UserBootApplication {
    public static void main(String[] args) throws SQLException {
        SpringApplication.run(UserBootApplication.class,args);
    }
}
