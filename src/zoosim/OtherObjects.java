/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 * For other objects
 * @author julialiu
 */
public class OtherObjects implements IObject {
    private IObject type;
    private int xPos;
    private int yPos;
    private String size;
    
    @Override
    public void turn(int degrees){
        System.out.println("You turned" + degrees + " degrees.");
    }
        
    @Override
    public void place(int x, int y){
        xPos = x;
        yPos = y;   
    }
}

