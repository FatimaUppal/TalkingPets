package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class CatTest {
    @Test
    public void testConstructor(){
        String givenName = "Jake";
        Cat cat = new Cat(givenName);
        Assert.assertEquals(givenName, cat.getName());
    }
    @Test
    public void testSpeak(){
        Cat cat = new Cat(null);
        String speakExpected = "Meow!";
        String speakActual = cat.speak();
        Assert.assertEquals(speakExpected, speakActual);
    }
    @Test
    public void testSetName(){
        String givenName = "Jake";
        Cat cat = new Cat(givenName);
        cat.setName("Max");

        Assert.assertEquals("Max", cat.getName());
    }
    @Test
    public void testGetName(){
        String givenName = "Bob";
        Cat cat = new Cat(givenName);
        Assert.assertEquals(givenName, cat.getName());
    }
}
