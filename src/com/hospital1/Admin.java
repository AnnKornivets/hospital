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

}
