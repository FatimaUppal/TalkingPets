package io.zipcoder.polymorphism;

public class Cat extends Pet {
    public Cat(String givenName) {
        super(givenName);
    }
    public String speak(){
        return "Meow!";
    }
}
