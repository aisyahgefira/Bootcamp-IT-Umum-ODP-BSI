package zoo;

public class Cat extends Animal{
    public boolean hashFur;
    public int numberOfWhiskers;
    private int lives = 9;

    //Consturctor parameter
    public Cat(String name, String species, String food, boolean hashFur, int whiskers) {
        super(name, species, food);
        this.hashFur = hashFur;
        this.numberOfWhiskers = whiskers;
    }

    public void makeSound() {
        System.out.println("meow");
    }
}
