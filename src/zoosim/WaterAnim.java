/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 *
 * @author julialiu
 */
public class WaterAnim extends Animal implements ISwimmable {
    private boolean canBreathe;
    private int y = super.getY();
    
    public WaterAnim(int sId, int sX, int sY, int sHunger, int sFatigue, int sSpeed, int sDirection, int sAge, String sName, String sSpecies, String sSex, String sSound, String sSize) {
        super(sId, sX, sY, sHunger, sFatigue, sSpeed, sDirection, sAge, sName, sSpecies, sSex, sSound, sSize);
    }
    public boolean canSurface(){
        y = 0;
        int surfaceH = super.setY(y);
        System.out.println("You have surfaced");
        return true;
    }

}
