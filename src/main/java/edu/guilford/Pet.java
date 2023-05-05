package edu.guilford;

import java.util.Random;

//create an abstract super class called Pet with the following attributes: name, age, and color
public class Pet implements Comparable<Pet> {
    protected String name;
    protected int age;
    protected String color;

    // Pet constructor
    public Pet(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    // constructor with random generation of attributes

    public Pet() {
        // array of 20 random pet names
        String[] names = { "Bella", "Charlie", "Luna", "Lucy", "Max", "Bailey", "Cooper", "Daisy", "Sadie", "Molly",
                "Buddy", "Lola", "Stella", "Tucker", "Bear", "Zoey", "Duke", "Harley", "Maggie", "Jax" };

        // array of 20 random pet colors
        String[] colors = { "Black", "White", "Brown", "Golden", "Yellow", "Grey", "Tan", "Red", "Blue", "Cream",
                "Silver", "Chocolate", "Fawn", "Sable", "Buff", "Orange", "Ruddy", "Liver", "Apricot", "Brindle" };

        Random rand = new Random();

        // random title and director from the arrays
        this.name = names[rand.nextInt(names.length)];
        this.color = colors[rand.nextInt(colors.length)];
        // random year between 1995 and 2023
        this.age = rand.nextInt(101) + 1;
    }

    // getter methods; no setter methods since we don't want to change the name,
    // age, or color of a pet
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    // abstract method to be implemented by subclasses
    public String speak() {
        return "I'm a pet and I'm speaking!";
    };

    // inherited method that demonstrates pet behavior
    public void doPetThings() {
        System.out.println("I'm a pet and I'm doing pet things!");
    }

    // compareTo method to compare pets by age
    @Override
    public int compareTo(Pet other) {
        return Integer.compare(this.age, other.age);
    }

    // to string method
    @Override
    public String toString() {
        return "Pet [Age: " + age + ", Color: " + color + ", Name: " + name + "]";
    }
}