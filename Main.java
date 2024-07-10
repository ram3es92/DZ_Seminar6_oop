package com.githab.ram3es92.homework;

public class Main{
    public static void main(String[] args){
        User user = new User("Bob");
        Saveable persister = new Persister(user);
        persister.save();
        user.report();
    }
}