package com.hospital1;


public class Doctors extends User {
    String nameDoctor;
    Speciality specialty;

    Doctors(String username, String password) {
        super(username, password);
    }


    public class Speciality{
       private String terapist;
       private String surgeon;
       private String oculist;

    }

    public String getNameDoctor() {
        return nameDoctor;
    }

    public void setNameDoctor(String nameDoctor) {
        this.nameDoctor = nameDoctor;
    }

    public Speciality getSpecialty() {
        return specialty;
    }

    public void setSpecialty(Speciality specialty) {
        this.specialty = specialty;
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
