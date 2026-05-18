package polymorphism;

public class main {
    
    public static void main(String args[]) {
        Animal[] Animals = {new cat(), new dog(), new cow()};
        for (Animal a : Animals) {
            a.animalSound();
        }

    }
}
