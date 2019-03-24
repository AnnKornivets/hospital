package com.hospital1;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        User loggedInUser = null;


        List <User> listOfUsers = new ArrayList<>();

        //создаем список пользователей
        listOfUsers.add(new User("terapist1","password1"));
        listOfUsers.add(new User("terapist2","password2"));
        listOfUsers.add(new User("terapist3","password3"));

        listOfUsers.add(new User("sergery1","password4"));
        listOfUsers.add(new User("sergery2","password5"));
        listOfUsers.add(new User("sergery3","password6"));

        listOfUsers.add(new User("oculist1","password4"));
        listOfUsers.add(new User("oculist2","password5"));
        listOfUsers.add(new User("oculist3","password6"));

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


