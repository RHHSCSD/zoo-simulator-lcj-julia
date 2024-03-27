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
    private int x;
    private int y;
    private String size;
    private int speed;
    private double direction;
    private int hunger;
    private int fatigue;
    private Image image;
    private String sound;
    
    @Override
public String toString() {
    return "Animal{" +
           "id=" + id +
           ", name='" + name + '\'' +
           ", species='" + species + '\'' +
           ", sex='" + sex + '\'' +
           ", age=" + age +
           ", position=(" + x + ", " + y + ")" +
           ", size='" + size + '\'' +
           ", speed=" + speed +
           ", direction=" + direction +
           ", hunger=" + hunger +
           ", fatigue=" + fatigue +
           ", sound='" + sound + '\'' +
           '}';
}

    
    //Speed
    public int getSpeed(String animSpeed){
        if (animSpeed.equals("Slow")){
            speed = 2;
        } else if (animSpeed.equals("Normal")){
            speed = 5;
        } else if (animSpeed.equals("fast")){
            speed = 8;
        }
        
        return speed;
    }
    
    //X
    public int setX(int xPos){
        x = xPos;
        return x;
    }
    
    //Y
    public int setY(int yPos){
        y = yPos;
        return y;
    }
    
    public int getY(){
        return y;
    }
    
    
    //Direciton
    public double getDirection(double animDirection){
        direction = animDirection;
        return direction;
    }
    
    public Animal(int sId, int sX, int sY, int sHunger, int sFatigue, int sSpeed, int sDirection, int sAge, String sName, String sSpecies, String sSex, String sSound, String sSize){
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
          
    
    public void makeSound(){//just print th sound
        System.out.println(sound);
    }
    
    public void move(){
        double radians = direction * Math.PI / 180;
        int changeX = (int) Math.cos(radians) * speed;
        int changeY = (int) Math.sin(radians) * speed;
        
        x += changeX;
        y += changeY;
        System.out.println("You moved " + x + " in the x direction and " + y + " in the y direciton at a speed of " + speed + "!");
    }
    
    public void eat(){
        hunger = 100;
        System.out.println(name + " ate a delicious meal!");
    }
    
    public void sleep(){
        fatigue = 100;
        System.out.println(name + " had a great sleep!");
    }
    
    public double turn(double degrees){
        direction += degrees;
        System.out.println("You turned " + direction + " degrees.");
        return direction;
    }
           
          
}
