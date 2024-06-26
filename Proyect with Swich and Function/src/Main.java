
class Animal {
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
    public void animalFood() {
        System.out.println("The animal food ");
    }
}


class Pig extends Animal {
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }

}

class Dog extends Animal {
    public void animalSound() {
        System.out.println("The dog says: bow wow");
    }
    public void animalFood() {
        System.out.println("The dog eat: dog kibble");
    }
}

class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();  // Create a Animal object
        Animal myPig = new Pig();// Create a Pig object
        Animal myDog = new Dog();  // Create a Dog object
        myAnimal.animalSound();
        myPig.animalSound();
        myPig.animalFood();
        myDog.animalSound();
        myDog.animalFood();
    }
}

