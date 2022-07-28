package oop;

import java.util.Date;

public class Person {
    private String name;
    private int age;
    private int sex;
    private Date birthDate;

    public Person(String n, int a, Date d) {
        name = n;
        age = a;
        birthDate = d;
    }

    public Person(String name, int age, int sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public Person(String n, int a) {
        name = n;
        age = a;
    }

    public Person(String n, Date d) {
        name = n;
        birthDate = d;
    }

    public Person(String n) {
        name = n;
        age = 30;
    }

    public void study() {
        System.out.println("Studying");
    }

    public void showAge() {
        System.out.println(age);
    }

    public int addAge(int i) {

        return age + 2;
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

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }
}
