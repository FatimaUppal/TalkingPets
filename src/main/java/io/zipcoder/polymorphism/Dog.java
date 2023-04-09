package io.zipcoder.polymorphism;

public class Dog extends Pet{
    public Dog(String givenName) {
        super(givenName);
    }
    public String speak(){
        return "Woof!";
    }
}
