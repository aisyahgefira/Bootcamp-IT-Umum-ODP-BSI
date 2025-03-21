package zoo;

public class Dog extends Animal {
    public Dog(String name, String species, String food) {
        super(name, species, food);
    }

    public void makeSound() {
        System.out.println("guk guk");
    }
}
