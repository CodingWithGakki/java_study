package oop;

public class Wolf extends Animal2 {
    public Wolf() {
//        super("灰太狼", 3);
        super("123", 3);
        System.out.println("wolf无参数的构造器");
    }

    public static void main(String[] args) {
        new Wolf();
    }
}

class Creature {
    public Creature() {
        System.out.println("Creature无参数的构造器");
    }
}

class Animal2 extends Creature {

    public Animal2(String name) {
        System.out.println("Animal带一个参数的构造器，该动物的name为" + name);
    }

    public Animal2(String name, int age) {
        this(name);
        System.out.println("Animal带两个参数的构造器,其age为" + age);
    }
}
