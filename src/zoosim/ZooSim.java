/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package zoosim;

/**
 * Zoo Simulator
 * @author Julia Liu
 */
public class ZooSim {
    // Create variables and array
    private Animal[] animArray = new Animal[10];
    int numAnimals = 0;
     
    /**
     * Add animal to animArray
     * @param newAnim
     */
    public void addAnimal(Animal newAnim){
        // Add animal into the array
        animArray[numAnimals] = newAnim;
        numAnimals ++;
    }
    
    /**
     * Print the animal array list containing animal statistics
     */
    public void printAnimals() {
        // Print the the coreresponding animal statistic and number
        int a = 1;
        for (int i = 0; i < numAnimals; i++) { 
            System.out.println("Animal " + a + ": " + animArray[i].toString());
            a ++;
        }
        
        // Print out total number of animals
        System.out.println("There is a total number of " + numAnimals + " animals!");
    }
    
    /**
     * Feed animal if it's hungry
     * @param newAnim
     */
    public void feed(Animal newAnim){
        newAnim.eat();
    }
    
    /**
     * Make animal go to bed if it's tired
     * @param newAnim
     */
    public void bed(Animal newAnim){
        newAnim.sleep();
    }
    
    /**
     * Move animal
     * @param newAnim
     */
    public void move(Animal newAnim){
        newAnim.move();
    }

    public static void main(String[] args) {
        // TODO code application logic here
        
        // Create land animals
        LandAnim cow = new LandAnim(1, 0, 0, 10, 100, 5, 10, 5, "Bob", "Cow", "Female", "Moo", "Big");
        LandAnim cat = new LandAnim(2, 5, 5, 5, 5, 5, 5, 5, "Yumi", "Cat", "Male", "Meow", "Small");
        // Create water animals
        WaterAnim dolphin = new WaterAnim(3, 6, 6, 6, 6, 6, 6, 6, "Dolly", "Fish", "Male", "Ahh", "Big");
        WaterAnim orca = new WaterAnim(4, 7, 7, 100, 7, 7, 7, 7, "Toothless", "Fish", "Female", "Ouhh", "Huge");
        // Create bird animals
        BirdAnim eagle = new BirdAnim(5, 8, 8, 8, 8, 8, 8, 8, "Bald", "Bird", "Male", "Ehh", "Medium");
        BirdAnim parrot = new BirdAnim(6, 2, 2, 2, 2, 2, 2, 2, "Talky", "Bird", "Female", "Hello!", "Small");
        
        // Create a zoo
        ZooSim z = new ZooSim();
        
        // add animals to an array
        z.addAnimal(cow);
        z.addAnimal(cat);
        z.addAnimal(dolphin);
        z.addAnimal(orca);
        z.addAnimal(eagle);
        z.addAnimal(parrot);
        
        
        // Perform actions on the animals
        z.bed(cow);
        z.move(cow); 
        z.feed(cat);
        z.move(cat);
        z.bed(eagle);
        z.feed(orca);
        
        // Print out animal statistics
        z.printAnimals();


        /* Q: How would you modify this structure to allow for predator/prey interactions and
           Carnivores/Omnivores/Herbivores?    
           
           A: For carnivores, onmicores and herbivores, I will create one variable in animal class that indicates through numbers whether its a carnivore, omnivore or herbivore. The food that
              the animals eat will depend on the type of animal it through, this can be implemented through a if statement in its eat method. For predators and prey, I will decide on who is the predator
              and who is the prey based on their size, speed and I'll also add a strength variable. 
              When creating my objects, I will assign different sizes, strengths and speed to each animal, and in the
              zoo class, I will compare these variables, and who ever is stronger, faster or bigger will be the predator. I will also take in consideration the distance between the animals. When they get to
`             a close enough distance, that is when the comparing will start. Another thing to compare is what type of food they eat, for example, an herbivore will never eat other animals, so 
              it can not be a predator. Lastly for determining prey and predator, I will look at their properties of being able to swim or fly, for example, an animal that cannot
              surface to the water will not be able to hunt a animal that only stay on land, and fishes that stay deep in the sea won't be able to be hunted by land or bird animals either. So the ability
              of each animal to fly or swim will be compared. 
              When a predator see a prey, it will start running towards it and eat it, which increases their hunger back to full. When a prey sees a predator, then 
              it will run away and it will get more tired (in my code, the higher the fatigue variable the less tired it is, so technically fatigue will decrease).
        */
    }
    
}
