package com.hospital1;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        Hospital hospital=new Hospital();
        Admin admin=new Admin("Марина","Ihatethiswork");
        Head_doctor head_doctor=new Head_doctor("Рита","solidaritywithMaria");

        User loggedInUser = null;


        List <User> listOfUsers = new ArrayList<>();

        //создаем список пользователей
        //врачи
//терапевт
        listOfUsers.add(new User("doctor_terapist","password1"));

//хирург
        listOfUsers.add(new User("doctor_sergery","password4"));

//окулист
        listOfUsers.add(new User("doctor_oculist","password6"));

//пациенты
        listOfUsers.add(new User("User345","password9"));
        listOfUsers.add(new User("User527","password10"));
        listOfUsers.add(new User("User743","password11"));



        System.out.println("Здравствуйте,зарегистрируйтесь или войдите в систему");
        Scanner k=new Scanner(System.in);
        System.out.println("Введите логин");
        String username=k.next();

        Scanner d=new Scanner(System.in);
        System.out.println("Введите пароль");
        String password=d.next();


        for (User user : listOfUsers)
        {
            if (user.getUsername().equals(username))
            {
                if (user.getPassword().equals(password))
                {
                    loggedInUser = user;

                    break;
                }
            }
        }
        if (loggedInUser != null)
        {
            System.out.println("User successfully logged in: "+loggedInUser.getUsername());
            if(username.contains("doctor")){
                System.out.println("Вы можете просмотреть свои записи");
            }
        }
        else
        {
            System.out.println("Invalid username/password combination or you can register");
            System.out.println("Введите логин");
            Scanner c=new Scanner(System.in);
            String username1=c.next();

            listOfUsers.add(new User(username1,"password"));

        }
    }
}


