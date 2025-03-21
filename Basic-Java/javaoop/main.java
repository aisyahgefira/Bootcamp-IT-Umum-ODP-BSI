import zoo.Animal;
import zoo.Cat;
import zoo.Dog;

public class main {
    public static void main(String[] args) {
        //Animal gajah = new Animal("gajah", "mamalia", "herbivore");
        //Animal macan = new Animal("macan", "mamalia", "carnivore");
        Animal anggora = new Cat("kocheng", "mamalia", "omnivore", true, 27);
        Animal pitbull = new Dog("pitbull", "anjing", "daging");
        //System.out.println(gajah.name);
        //System.out.println(macan.name);
        System.out.println(anggora);
        anggora.makeSound();
        pitbull.makeSound();
    }
}
