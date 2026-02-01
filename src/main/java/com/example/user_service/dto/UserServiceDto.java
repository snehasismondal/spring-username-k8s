package com.example.user_service.dto;

/**
 * @author Snehasis Mondal
 */

public class UserServiceDto {
    public Long id;
    public String name;

    public UserServiceDto(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public String email;

    public UserServiceDto(int i, String a, String s) {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
