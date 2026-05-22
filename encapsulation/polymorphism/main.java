package polymorphism;

public class main {
    
    public static void main(String args[]) {
        Animal[] animals={new dog(),new cat(),new cow()};
        for (Animal a:animals){
            System.out.println(a.sound());
        }
    }
        }