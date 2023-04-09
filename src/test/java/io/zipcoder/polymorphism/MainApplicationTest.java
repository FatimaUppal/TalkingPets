package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class MainApplicationTest {
    @Test
    public void testArrayListNames(){
        //Given
        Dog dog = new Dog("Zack");
        Cat cat = new Cat("Paul");
        Bird bird = new Bird("King");

        //When
        ArrayList<Pet> pets = new ArrayList<>(Arrays.asList(dog, cat, bird));
        String[] names = {"Zack", "Paul", "King"};

        //Then
        Assert.assertEquals(names, MainApplication.getUserPetNames(pets));
    }

    @Test
    public void testArrayListSpeak(){
        //Given
        Dog dog = new Dog("Zack");
        Cat cat = new Cat("Paul");
        Bird bird = new Bird("King");

        //When
        ArrayList<Pet> pets = new ArrayList<>(Arrays.asList(dog, cat, bird));
        String[] speak = {"Woof!", "Meow!", "Squawk!"};

        //Then
        Assert.assertEquals(speak , MainApplication.getUserPetSpeak(pets));
    }
}
