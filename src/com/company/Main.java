package com.company;

public class Main {

    public static void main(String[] args) {
        User myUser = new User("pepa", 18, "hhahaha");
        Admin myAdmin = new Admin("Gates", 50, "asdasfscs");
        myAdmin.ban();
        myAdmin.picture();
        myUser.picture();
        myAdmin.login();
        myUser.login();
        myAdmin.logout();
        myUser.logout();

    }
}
