package com.githab.ram3es92.homework;

public class Persister implements Saveable{ // Сделал класс Persister зависисмым через интерфейс Saveable,что позволит легко заменять реализацию сохранения.
                                            // Это соблюдение пятого принципа SOLID "Модули верхнего уровня не должны зависеть от модулей нижнего уровня. 
                                            // И те, и другие должны зависеть от абстракции. Абстракции не должны зависеть от деталей. Детали должны зависеть от абстракций."
    private final User user;

    public Persister(User user){
        this.user = user;
    }

    @Override
    public void save(){
        System.out.println("Save user: " + user.getName());
    }
}