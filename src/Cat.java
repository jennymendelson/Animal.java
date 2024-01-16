public class Cat extends Animal {
    public Cat (String type, String color) {
        super("Cat", color, type);
    }

    //Behavior
    public void makeSound() {
        System.out.println("Meow Meow!");
    }
}

