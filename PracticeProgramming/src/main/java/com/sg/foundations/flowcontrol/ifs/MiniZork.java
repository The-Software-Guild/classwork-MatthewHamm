/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.flowcontrol.ifs;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Matthew Hamm
 */
public class MiniZork {
    List<String> Inventory = new LinkedList<String>();
    Scanner userInput = new Scanner(System.in);
    int health=10;
    public static void main(String[] args) {
        MiniZork zork=new MiniZork();
        

        
            
        
        start(zork);

    }
    public static void start(MiniZork zork){
        
        System.out.println("You are standing in an open field west of a white house,");
        System.out.println("With a boarded front door.");
        System.out.println("There is a small mailbox here.");
        System.out.print("Go to the house, or open the mailbox? ");

        String action = zork.userInput.nextLine();
        
        if (action.contains("mail")) {
            mailbox(zork);
            
        } 
        else if (action.contains("house")) {
            house(zork);
        }else if(action.contains("east")||action.contains("leave")||action.contains("west")||action.contains("north")||action.contains("south")||action.contains("go")){
                    
            field(zork);
            
        }
        
    }
    public static void mailbox(MiniZork zork){
        String action = zork.userInput.nextLine();
        System.out.println("You open the mailbox.");
        System.out.println("It's really dark in there.");
        System.out.println("Look inside or stick your hand in? ");
        action = zork.userInput.nextLine();

        if (action.contains("look")) {
            System.out.println("You peer inside the mailbox.");
            System.out.println("It's really very dark. So ... so very dark.");
            System.out.println("Run away or keep looking? ");
            action = zork.userInput.nextLine();


            if (action.contains("run")||action.contains("east")||action.contains("leave")||action.contains("west")||action.contains("north")||action.contains("south")||action.contains("go")) {
                System.out.println("You run away screaming across the fields - looking very foolish.");
                System.out.println("But you alive. Possibly a wise choice.");
                start(zork);
            }
            else if (action.contains("look")) {
                System.out.println("Turns out, hanging out around dark places isn't a good idea.");
                System.out.println("You've been eaten by a grue.");
            }
        } else if (action.contains("hand")) {
            System.out.println("You pick up some grue slime");
            zork.Inventory.add("grue slime");
            mailbox(zork);
        } 
        else if (action.contains("east")||action.contains("leave")||action.contains("west")||action.contains("north")||action.contains("south")||action.contains("go")){
            start(zork);
        }
    }
    public static void house(MiniZork zork) {
        
        System.out.println("You see a large oak door, a window and a broom");
        String action = zork.userInput.nextLine();
        if(action.contains("door")){
            System.out.println("The door looks sturdy and is locked");
            house(zork);
        }else if(action.contains("window")){
            System.out.println("Window looks heavy and inside the house you see an empty room");
            house(zork);
        }else if(action.contains("broom")){
            System.out.println("Do you want to pick up the broom(y/n)?");
            zork.Inventory.add("broom");
            action = zork.userInput.nextLine();
            if(action.contains("y")){
                System.out.println("You picked up a broom");
                house(zork);
            }else if(action.contains("n"))
            {
                house(zork);
            }

        }
        else if (action.contains("east")||action.contains("leave")||action.contains("west")||action.contains("north")||action.contains("south")||action.contains("go")){
            start(zork);
        }
    }
    public static void field(MiniZork zork) {
        System.out.println("You are surrouded by forest");
        System.out.println("Except for a small path leading deeper into the forest");
        System.out.println("Go to the path, or return to the house ");
        
        String action = zork.userInput.nextLine();
        if(action.contains("path")){
            path(zork);

        }else if(action.contains("house")){

            start(zork);
        }        
    }
    public static void path(MiniZork zork) {
        System.out.println("As you follow the path you come to fork in the path");
        System.out.println("To the left you hear the chirping of birds and to the right you hear the howling of wolves");
        System.out.println("Do you want to go left, right or back?");
        
        String action = zork.userInput.nextLine();
        if(action.contains("left")){
            pathLeft(zork);

        }else if(action.contains("right")){

            
        }else if(action.contains("back")){
            field(zork);
        
        } 
    }
    public static void pathLeft(MiniZork zork) {
        System.out.println("You come to a tree and see a nest with object in it which almost blinds you from the reflection of the sun");
        System.out.println("Do you want to go back or up the tree");
        String action = zork.userInput.nextLine();
        if(action.contains("tree")){
            tree(zork);

        }else if(action.contains("back")){
            path(zork);
        
        } 
    }
    public static void tree(MiniZork zork) {
        System.out.println("You see a concave mirror in the nest with a blue egg");
        System.out.println("Do you want to take the egg, the mirror or go back");
        String action = zork.userInput.nextLine();
        if(action.contains("egg")){
            System.out.println("You go to pick up the egg when an angry magpie swoops down");
            bird(zork);

        }else if(action.contains("mirror")){
            System.out.println("You manage to pick up the mirror when an angry magpie swoops down");
            zork.Inventory.add("mirror");
            bird(zork);
        
        }else if(action.contains("back")){
            pathLeft(zork);
        
        } 
    }
    public static void bird(MiniZork zork) {
        Random randomiser=new Random();
        int birdHealth=5;
        boolean ranAway=false;
        while(birdHealth>0 && !ranAway){
            System.out.println("You are hit by the magpie");
            --zork.health;
            System.out.println("Do you want to attack, run or defend");
            String action = zork.userInput.nextLine();
            if(action.contains("broom")){
                System.out.println("You batter the magpie with the broom");
                birdHealth-=2;

            }else if(action.contains("mirror")){
                System.out.println("You manage to burn the magpie to crisp with the mirror");
                birdHealth=0;
                

            }else if(action.contains("attack")){
                if(randomiser.nextInt(2)>0){
                    System.out.println("You hit the magpie");
                    --birdHealth;
                }else{
                    System.out.println("You miss the magpie");
                }
                

            }else if(action.contains("defend")){
                System.out.println("You block the magpies attack");
                ++zork.health;
            
            }else if(action.contains("run")){
            
            } 
        }

        
    }
    public static void pathRight(MiniZork zork) {
        System.out.println("As you follow the path you come to fork in the path");
        System.out.println("To the left you hear the chirping of birds and to the right you hear the howling of wolves");
        System.out.println("Do you want to go left, right or back?");
    }
}
