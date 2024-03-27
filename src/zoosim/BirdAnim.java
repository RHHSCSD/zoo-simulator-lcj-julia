/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 *
 * @author julialiu
 */
public class BirdAnim extends Animal implements IFlyable {
    private boolean canFly;
    private int y = super.getY();
    
    public BirdAnim(int sId, int sX, int sY, int sHunger, int sFatigue, int sSpeed, int sDirection, int sAge, String sName, String sSpecies, String sSex, String sSound, String sSize) {
        super(sId, sX, sY, sHunger, sFatigue, sSpeed, sDirection, sAge, sName, sSpecies, sSex, sSound, sSize);
    }
    
    public void fly(){
        y += 6;
        int flyH = super.setY(y);
        System.out.println("You flew up " + y + "blockes.");
             
    }
    
    public void land(){
        y = 0;
        int landH = super.setY(y);
        System.out.println("You landed.");
        
    }
    
    public void isFlying(){
        canFly = true;
    }
    
}
