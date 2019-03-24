package com.hospital1;

public class User {
    private String username;
    private String password;

    User(String username, String password)
    {
        this.username = username;
        this.password = password;
    }

    String getUsername() {return username;}
    String getPassword() {return password;}

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
