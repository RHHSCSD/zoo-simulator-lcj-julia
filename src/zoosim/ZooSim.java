/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package zoosim;

/**
 *
 * @author michael.roy-diclemen
 */
public class ZooSim {
     private Animal[] animArray = new Animal[10];
     int numAnimals = 0;
     
    public void addAnimal(Animal newAnim){
        animArray[numAnimals] = newAnim;
        numAnimals ++;
    }
    
    public void printAnimals() {
        for (int i = 0; i < numAnimals; i++) {
            System.out.println(animArray[i].toString());
        }
        
        System.out.println("There is a total number of " + numAnimals + " animals!");
    }
    
    public void feed(Animal newAnim){
        newAnim.eat();
    }
    
    public void bed(Animal newAnim){
        newAnim.sleep();
    }
    
    public void move(Animal newAnim){
        newAnim.move();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //cow
        LandAnim cow = new LandAnim(1, 0, 0, 10, 5, 5, 10, 5, "Bob", "Cow", "Female", "Moo", "Big");
        LandAnim cat = new LandAnim(2, 5, 5, 5, 5, 5, 5, 5, "Yumi", "Cat", "Male", "Meow", "Small");
        WaterAnim dolphin = new WaterAnim(3, 6, 6, 6, 6, 6, 6, 6, "Dolly", "Fish", "Male", "Ahh", "Big");
        WaterAnim orca = new WaterAnim(4, 7, 7, 7, 7, 7, 7, 7, "Toothless", "Fish", "Female", "Ouhh", "Huge");
        BirdAnim eagle = new BirdAnim(5, 8, 8, 8, 8, 8, 8, 8, "Bald", "Bird", "Male", "Ehh", "Medium");
        BirdAnim parrot = new BirdAnim(6, 2, 2, 2, 2, 2, 2, 2, "Talky", "Bird", "Female", "Hello!", "Small");
        
        ZooSim z = new ZooSim();
        z.addAnimal(dolphin);
        z.addAnimal(orca);
        z.addAnimal(eagle);
        z.addAnimal(parrot);
        z.addAnimal(cow);
        z.bed(cow);
        z.move(cow);
        z.addAnimal(cat);
        z.feed(cat);
        z.move(cat);
        z.printAnimals();


    }
    
}
