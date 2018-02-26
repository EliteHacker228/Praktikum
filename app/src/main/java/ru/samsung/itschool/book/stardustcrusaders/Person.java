package ru.samsung.itschool.book.stardustcrusaders;

/**
 * Created by Максим on 25.02.2018.
 */

public class Person {
    String name;
    int flag_res; // имя ресурса флага
    String money; // состояние в строковом формате

    public Person(String name, String money, int flag_res) {
        this.flag_res = flag_res;
        this.money = money;
        this.name = name;
    }
}