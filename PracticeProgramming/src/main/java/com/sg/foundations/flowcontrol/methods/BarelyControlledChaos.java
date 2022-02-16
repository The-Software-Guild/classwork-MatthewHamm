package com.sg.foundations.flowcontrol.methods;

import java.awt.*;
import java.util.Random;

public class BarelyControlledChaos {

    public static void main(String[] args) {
        Random randomiser=new Random();
        String color = randomColour(randomiser); // call color method here
        String animal = randomAnimal(randomiser); // call animal method again here
        String colorAgain = randomColour(randomiser); // call color method again here
        int weight = randomInt(randomiser,5,200); // call number method,
        // with a range between 5 - 200
        int distance = randomInt(randomiser,10,20); // call number method,
        // with a range between 10 - 20
        int number = randomInt(randomiser,10000,20000); // call number method,
        // with a range between 10000 - 20000
        int time = randomInt(randomiser,2,6); // call number method,
        // with a range between 2 - 6

        System.out.println("Once, when I was very small...");

        System.out.println("I was chased by a " + color + ", "
                + weight + "lb " + " miniature " + animal
                + " for over " + distance + " miles!!");

        System.out.println("I had to hide in a field of over "
                + number + " " + colorAgain + " poppies for nearly "
                + time + " hours until it left me alone!");

        System.out.println("\nIt was QUITE the experience, "
                + "let me tell you!");
    }
    static String randomAnimal(Random random) {
        int animalChoice = random.nextInt(5);
        switch (animalChoice) {
            case 0:
                return "cat";
            case 1:
                return "dog";
            case 2:
                return "turtle";
            case 3:
                return "chicken";
            case 4:
                return "fox";
            default:
                return "";
        }

    }
    static String randomColour(Random random) {
        int animalChoice = random.nextInt(5);
        switch (animalChoice) {
            case 0:
                return "red";
            case 1:
                return "blue";
            case 2:
                return "green";
            case 3:
                return "yellow";
            case 4:
                return "purple";
            default:
                return "";
        }
    }
    static int randomInt(Random random, int lower,int upper){
        int range=upper-lower;
        return random.nextInt(range)+lower;
    }

    // ??? Method 1 ???
    // ??? Method 2 ???
    // ??? Method 3 ???
}
