package main.java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@ComponentScan("main.java")
public class User {
   String userName;
   String password;

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
}
