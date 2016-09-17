package my.spring.annotation.test.service;



import my.spring.annotation.LogAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
 //与其它注解一样的使用
    @LogAnnotation(desc="this is UserService")
    public void add() {
        System.out.println("UserService add...");
    }
}
