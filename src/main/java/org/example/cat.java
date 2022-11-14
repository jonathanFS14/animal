package org.example;
public class cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("miav miav");
    }
    @Override
    public boolean eat(String foodType) {
        return true;
    }
}
