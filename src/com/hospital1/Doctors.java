package com.hospital1;

public class Doctors {
    String nameDoctor;
    Speciality specialty;


    public class Speciality{
        String terapist="terapist";
        String surgeon ="sergery";
        String oculist="oculist";

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

    public void readPrescription(){


    }

}
