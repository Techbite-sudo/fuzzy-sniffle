package com.example.login_register_ladesha;

public class HelperClass {
    String name, email,password,username;

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public HelperClass(String name, String email,String username, String password){
        this.name = name;
        this.email = email;
        this.username = username;
        this.password = password;

    }
}