package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class BirdTest {
    @Test
    public void testConstructor(){
        String givenName = "Jake";
        Bird bird = new Bird(givenName);
        Assert.assertEquals(givenName, bird.getName());
    }
    @Test
    public void testSpeak(){
        Bird bird = new Bird(null);
        String speakExpected = "Squawk!";
        String speakActual = bird.speak();
        Assert.assertEquals(speakExpected, speakActual);
    }
    @Test
    public void testSetName(){
        String givenName = "Jake";
        Bird bird = new Bird(givenName);
        bird.setName("Max");

        Assert.assertEquals("Max", bird.getName());
    }

    @Test
    public void testGetName(){
        String givenName = "Bob";
        Bird bird = new Bird(givenName);
        Assert.assertEquals(givenName, bird.getName());
    }
}
