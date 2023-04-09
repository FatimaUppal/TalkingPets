package io.zipcoder.polymorphism;

public class Bird extends Pet{

    public Bird(String givenName) {
        super(givenName);
    }
    public String speak(){
        return "Squawk!";
    }
}
