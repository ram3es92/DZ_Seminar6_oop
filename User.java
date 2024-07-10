package com.githab.ram3es92.homework;

public class User{
    private final String name;

    public User(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
/* Необходимо удалить этот учаток кода из класса User, и перенести логику сохранения
в интерфейс Saveable, так как этот метод здесь нарушает первый принцип "ответственности"
    public void save(){
        Persister persister = new Persister(this);
        persister.save();
    }
*/
    public void report(){
        System.out.println("Report for user: " + name);
    }
}