package com.hospital1;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        User loggedInUser = null;

        // Create an empty list to hold users
        List <User> listOfUsers = new ArrayList<>();

        // Add 3 users to the list
        listOfUsers.add(new User("terapist1","password1"));
        listOfUsers.add(new User("terapist2","password2"));
        listOfUsers.add(new User("terapist3","password3"));

        listOfUsers.add(new User("sergery1","password4"));
        listOfUsers.add(new User("sergery2","password5"));
        listOfUsers.add(new User("sergery3","password6"));

        listOfUsers.add(new User("oculist1","password4"));
        listOfUsers.add(new User("oculist2","password5"));
        listOfUsers.add(new User("oculist3","password6"));


        Scanner k=new Scanner(System.in);
        System.out.println("Введите логин");
        String username=k.next();

        Scanner d=new Scanner(System.in);
        System.out.println("Введите пароль");
        int password=d.nextInt();


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



    }
}
