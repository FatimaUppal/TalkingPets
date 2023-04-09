package io.zipcoder.polymorphism;

public class Pet {
    String name;

    public Pet(String givenName){
        this.name=givenName;
    }
    public String getName(){
        return name;
    }
    public String setName(String oreo){
        return this.name= oreo;
    }
    public String speak(){
        return "";
    }
}
