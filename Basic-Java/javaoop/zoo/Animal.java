package zoo;

public abstract class Animal {
    public String name;
    public String species;
    public String food;
    private int energy = 30;
    private int hungerlevel = 0;

    public Animal(String name, String species, String food) {
        this.name = name;
        this.species = species;
        this.food = food;
    }

    // Tell dont ask
    public boolean isHungry() {
        return this.hungerlevel >= 50;
    }

    public boolean isTired() {
        return this.energy < 10;
    }

    public abstract void makeSound();

    public void sleep() {
        this.energy++;
        this.hungerlevel++;
    }
}
