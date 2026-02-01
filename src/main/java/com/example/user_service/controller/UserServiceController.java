package com.example.user_service.controller;

import com.example.user_service.dto.UserServiceDto;
import org.apache.catalina.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Snehasis Mondal
 */
@RestController
public class UserServiceController {

    @GetMapping("/greetings")
    public String greeting(){
        return "Hello from K8s test proj";
    }

    @GetMapping("/users")
    public List<UserServiceDto> mapping(){
        return Stream.of(
                new UserServiceDto(1L,"A","a@a.com"),
                new UserServiceDto(2L,"B","b@b.com")
        ).collect(Collectors.toList());
    }
}
