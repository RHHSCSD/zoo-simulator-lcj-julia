/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 * Class for creating animals that can swim
 * @author julialiu
 */
public class WaterAnim extends Animal implements ISwimmable {
    private boolean canBreathe;
    private double y = super.getY();
    
    public WaterAnim(int sId, double sX, double sY, int sHunger, int sFatigue, int sSpeed, int sDirection, int sAge, String sName, String sSpecies, String sSex, String sSound, String sSize) {
        super(sId, sX, sY, sHunger, sFatigue, sSpeed, sDirection, sAge, sName, sSpecies, sSex, sSound, sSize);
    }
    public boolean canSurface(){
        // Set surface of water as 0 for y
        y = 0;
        // Set the y of the animal object to 0
        super.setY(y);
        System.out.println("You have surfaced");
        return true;
    }

}
