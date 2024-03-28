/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 * Class for creating animals that can fly
 * @author julialiu
 */
public class BirdAnim extends Animal implements IFlyable {
    private boolean canFly;
    private double y = super.getY();
    
    public BirdAnim(int sId, double sX, double sY, int sHunger, int sFatigue, int sSpeed, int sDirection, int sAge, String sName, String sSpecies, String sSex, String sSound, String sSize) {
        super(sId, sX, sY, sHunger, sFatigue, sSpeed, sDirection, sAge, sName, sSpecies, sSex, sSound, sSize);
    }
    
    public void fly(){
        // Add 6 to orignal y value
        y += 6;
        // Set the y of the animal object to the new y value
        super.setY(y);
        System.out.println("You flew up " + y + "blockes.");
             
    }
    
    public void land(){
        // Set land as 0 for y value
        y = 0;
        // Set the y of the animal object to 0
        super.setY(y);
        System.out.println("You landed.");
        
    }
    
    public void isFlying(){
        canFly = true;
    }
    
}
