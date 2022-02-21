/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.basics.core.classmodeling;

/**
 *
 * @author Matthew Hamm
 */
public class House3D {
    private int height;
    private int width;
    private int depth;
    private int floors;
    private int[] roomsFloor;
    private int gardenArea;
    
    public int setHeight(int height){
        this.height=height;
        return this.height;
    }
    public int getHeight(){
        
        return height;
    }
    public int setWidth(int width){
        this.width=width;
        return this.width;
    }
    public int getWidth(){
        
        return width;
    }
    public int setDepth(int depth){
        this.depth=depth;
        return this.depth;
    }
    public int getDepth(){
        
        return depth;
    }
    public int setFloors(int floors){
        this.floors=floors;
        return this.floors;
    }
    public int getFloors(){
        
        return floors;
    }
    public int[] setRoomFloors(int[] roomFloors){
        this.roomsFloor=roomFloors;
        this.floors=roomFloors.length;
        return this.roomsFloor;
    }
    public int[] getRoomFloors(){
        
        return roomsFloor;
    }
    public int setGardenArea(int gardenArea){
        this.gardenArea=gardenArea;
        return this.gardenArea;
    }
    public int getGardenArea(){
        
        return gardenArea;
    }
    public int totalRooms(){
        //count total number of rooms
        return 0;
    }
}
