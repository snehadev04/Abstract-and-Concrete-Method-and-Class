// Abstract class Animal
abstract class Animal 
{
    // Abstract methods (to be implemented by subclasses)
    abstract public void TypeOfNoise();
    abstract public void ColorOfFur();

    // Concrete method (provides a default implementation)
    public void NumberOfLegs() {
        System.out.println("Four"); // Prints the number of legs for an animal
    }
}

// Abstract subclass Dog extending from Animal

//Being abstract itself, Dog doesn't need to implement all abstract methods inherited from Animal,leaving some to be implemented by its subclasses.

abstract class Dog extends Animal 
{
    // Implementation of abstract method TypeOfNoise for Dog
    public void TypeOfNoise() {
        System.out.println("Bark"); // Prints the noise a dog makes
    }
}


// Concrete subclass Tiger extending from Dog (and indirectly from Animal)
class Tiger extends Dog {
    // Implementation of abstract method ColorOfFur for Tiger
    public void ColorOfFur() {
        System.out.println("Black and Orange"); // Prints the color of a tiger's fur
    }
    @Override
    public void TypeOfNoise()
    {
        System.out.println("Roar");
    }
}

// Main class abstrac to demonstrate usage
public class abstrac {
    public static void main(String[] args) {
        // Create a Tiger object and assign it to an Animal reference
        Animal A = new Tiger();

        // Call methods using the Animal reference
        A.TypeOfNoise(); // Calls Tiger's implementation: "Bark"
        A.ColorOfFur();  // Calls Tiger's implementation: "Black and Orange"
        A.NumberOfLegs(); // Calls Animal's implementation: "Four"
    }
}
