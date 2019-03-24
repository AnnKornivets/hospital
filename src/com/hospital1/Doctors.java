package com.hospital1;


public class Doctors {
    String nameDoctor;
    Speciality specialty;


    public class Speciality{
       private String terapist="terapist";
       private String surgeon ="sergery";
       private String oculist="oculist";

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

    public void read(){


    }

}
