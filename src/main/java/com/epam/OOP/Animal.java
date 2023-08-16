package com.epam.OOP;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription(){
        String fur = this.hasFur == true ? "a" : "no";
        String paws = this.numberOfPaws == 1 ? " paw" : " paws";
        return "This animal is mostly " + this.color + ". It has " + this.numberOfPaws + paws + " and " + fur + " fur.";
    }

    public static void main(String[] args) {
        Animal animal = new Animal("black", 4, true);
        Animal dog = new Dog();
        Animal bird = new Bird();
        System.out.println(animal.getDescription());
        System.out.println(dog.getDescription());
        System.out.println(bird.getDescription());
    }
    /*
    EXPLANATION
    The output is different because the getDescription() method of the Bird class is redefined, more precisely,
    the method of the parent Animal class is taken and its own implementation of this method is written in the
    successor class. The new implementation "replaced" the parent in the child class Bird.
    */
}
