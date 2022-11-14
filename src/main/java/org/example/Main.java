package org.example;
public class Main {
    public static void main(String[] args) {
       Animal dog = new dog();
       dog.makeSound();
       Animal cat = new cat();
       cat.makeSound();
       cat.eat("cat-food");
       dog.eat("dog-food");

       cat.showMood(true);
       cat.showMood(false);
}
}