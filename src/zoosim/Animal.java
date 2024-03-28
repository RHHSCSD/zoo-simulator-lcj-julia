/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 * Creating animals
 * @author julialiu
 */
public class Animal {
    // Set variables
    private int id;
    private String name;
    private String species;
    private String sex;
    private int age;
    private double x;
    private double y;
    private String size;
    private int speed;
    private double direction;
    private int hunger;
    private int fatigue;
    private Image image;
    private String sound;
    
    /**
     * Override original toString method, print out all animal statistics
     * @return String
     */
    @Override
    public String toString() {
        return "\n\nID: " + id +
               "\nName: " + name +
               "\nSpecies: " + species +
               "\nSex: " + sex +
               "\nAge: " + age +
               "\nPosition: (" + x + ", " + y + ")" +
               "\nSize: " + size + 
               "\nSpeed: " + speed +
               "\nDirection: " + direction +
               "\nHunger: " + hunger +
               "\nFatigue: " + fatigue +
               "\nSound: " + sound + "\n";
            
    }

    public void setY(double yPos){
        y = yPos;
    }
    
    /**
     * Getting the y value of the animal
     * @return the y value of the animal
     */
    public double getY(){
        return y;
    }

    /**
     * Animal Constructor
     * @param sId
     * @param sX
     * @param sY
     * @param sHunger
     * @param sFatigue
     * @param sSpeed
     * @param sDirection
     * @param sAge
     * @param sName
     * @param sSpecies
     * @param sSex
     * @param sSound
     * @param sSize
     */
    public Animal(int sId, double sX, double sY, int sHunger, int sFatigue, int sSpeed, int sDirection, int sAge, String sName, String sSpecies, String sSex, String sSound, String sSize){
        id = sId;
        x = sX;
        y = sY;
        hunger = sHunger;
        fatigue = sFatigue;
        speed = sSpeed;
        direction = sDirection;
        age = sAge;
        name = sName;
        species = sSpecies;
        sex = sSex;
        sound = sSound;
        size = sSize;
               
              
    }
          
    /**
     * Make animal make sounds
     */
    public void makeSound(){//just print th sound
        System.out.println(sound);
    }
    
    /**
     * Move the animal
     */
    public void move(){
        double radians = direction * Math.PI / 180;
        double changeX = Math.cos(radians) * speed;
        double changeY = Math.sin(radians) * speed;
        
        x += Math.round(changeX*100.0) / 100.0;
        y += Math.round(changeY*100.0) / 100.0;
        System.out.println("You moved " + x + " in the x direction and " + y + " in the y direciton at a speed of " + speed + "!");
    }
    
    /**
     * Replenish animal's hunger
     */
    public void eat(){
        // Let animal eat when it's hungry
        if (hunger < 100){
            hunger = 100;
            System.out.println(name + " ate a delicious meal!");
        } else {
            System.out.println(name + " is already full");
        }
    }
    
    /**
     * Replenish animal's fatigue level
     */
    public void sleep(){
        // Let animal sleep when it's tired
        if (fatigue < 100){
            fatigue = 100;
            System.out.println(name + " had a great sleep!");
        } else {
            System.out.println(name + " is not tired");
        }
    }
    
    /**
     * Turn animal
     * @param degrees the number of degree the animal should turn
     * @return direction the final degree the animal is facing
     */
    public double turn(double degrees){
        // Add the degree animal should turn to it's original degree
        direction += degrees;
        System.out.println("You turned " + direction + " degrees.");
        return direction;
    }
           
          
}
