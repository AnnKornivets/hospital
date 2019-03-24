package com.hospital1;

public class Patients extends User {


   public Patients(String username, String password) {
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
