package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class DogTest {
    @Test
    public void testConstructor(){
        String givenName = "Jake";
        Dog dog = new Dog(givenName);
        Assert.assertEquals(givenName, dog.getName());
    }
    @Test
    public void testSpeak(){
        Dog dog = new Dog(null);
        String speakExpected = "Woof!";
        String speakActual = dog.speak();
        Assert.assertEquals(speakExpected, speakActual);
    }
    @Test
    public void testSetName(){
        String givenName = "Jake";
        Dog dog = new Dog(givenName);
        dog.setName("Max");

        Assert.assertEquals("Max", dog.getName());
    }
    @Test
    public void testGetName(){
        String givenName = "Bob";
        Dog dog = new Dog(givenName);
        Assert.assertEquals(givenName, dog.getName());
    }
}
