package oop;

import java.util.Date;

public class Inheritance {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.getInfo();
    }
}

class Person1{
    public String name;
    public int age;
    public Date birthDate;

    public String getInfo(){
        System.out.println("info");
        return name+age+birthDate;
    }
}

class Student extends Person1{
    public String school;
}
