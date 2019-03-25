package com.hospital1;

public class Admin extends User {


   public Admin(String username, String password) {
        super(username, password);

    }

    @Override
    String getUsername() {
        return super.getUsername();
    }

    @Override
    String getPassword() {
        return super.getPassword();
    }

    @Override
    public void setUsername(String username) {
        super.setUsername(username);
    }

    @Override
    public void setPassword(String password) {
        super.setPassword(password);
    }
}
