package com.githab.ram3es92.homework;
/*Создал интерфейс Saveable, который позволит добавлять новые способы сохранения, не изменяя существующий код,
 * чтобы соблюсти второй принцип SOLID, т.е. "классы, модули, функции и т.п. должны быть расширяемыми без изменения своего содержимого".
  */
public interface Saveable {
    void save();
}