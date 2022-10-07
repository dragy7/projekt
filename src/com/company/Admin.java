package com.company;

public class Admin extends User {
    private String name;
    private int age;
    private String password;

    public Admin(String name, int age, String password) {
        this.name = name;
        this.age = age;
        this.password = password;

    }
    public void login(){
        System.out.println("umi se prilasit");
    }
    public void ban(){
        System.out.println("muze banovat");
    }
    public void picture(){
        System.out.println("umi pridat obbrazek");
    }
    public void logout(){
        System.out.println("umi se odhlasit");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", password='" + password + '\'' +
                '}';
    }
}
