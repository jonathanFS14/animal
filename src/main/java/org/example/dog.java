package org.example;
public class dog extends Animal {

    @Override
    public void makeSound() {
        System.out.println("wuf wuf");
    }

    @Override
    public boolean eat(String foodtype) {
        return true;
    }
}
