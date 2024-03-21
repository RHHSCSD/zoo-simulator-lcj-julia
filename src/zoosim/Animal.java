/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 *
 * @author julialiu
 */
public class Animal {
    private int id;
    private String name;
    private String species;
    private String sex;
    private int age;
    private int position;
    private String size;
    private double direction;
    private int hunger;
    private int fatigue;
    private Image image;
    private String sound;
    
    public Animal(int sId, String sName, String sSpecies, String sSex, int sAge){
        id = sId;
        name = sName;
        species = sSpecies;
        sex = sSex;
        age = sAge;
               
    }
    
    public Animal(){
        
    }
          
    
    public String makeSound(String sSpecies){
        String soundMade = "";
        if (sSpecies.equals("cat")){
            soundMade = "Meow";
        }
        return soundMade;
    }
    
    public void move(){
        System.out.println("You moved forward");
    }
    
    public void eat(){
        hunger = 100;
        System.out.println("You ate a delicious meal!");
    }
    
    public void sleep(){
        fatigue = 100;
        System.out.println("You had a great sleep!");
    }
    
    public double turn(double degrees){
       direction += degrees;
       return direction;
    }
           
          
}
