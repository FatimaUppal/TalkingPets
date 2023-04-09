package io.zipcoder.polymorphism;

import java.util.ArrayList;

public class MainApplication {
    public static String[] getUserPetNames(ArrayList<Pet> pets){
        String[] petNames = new String[pets.size()];
        for (int i = 0; i < pets.size(); i++) {
            petNames[i] = pets.get(i).getName();
        }
        return petNames;
    }
    public static String[] getUserPetSpeak(ArrayList<Pet> pets){
        String[] petNoises = new String[pets.size()];
        for (int i = 0; i < pets.size(); i++) {
            petNoises[i] = pets.get(i).speak();
        }
        return petNoises;
    }
}
