package com.ibm.spring.beans;

public class AuthService {
    private String userName = "admin";
    private String password = "admin";

    private AuthService() {

    }

    //Factory method through which you can create object
    public static AuthService getInstance() {
        System.out.println("Factory");
        return new AuthService();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
