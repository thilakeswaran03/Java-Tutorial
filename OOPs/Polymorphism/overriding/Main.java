public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.sound();
        Dog d = new Dog();
        d.sound();
    }
}

class Animal{
    public void Animal(){
        System.out.println("This is an animal");
    }
    public void sound(){
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal{
    @Override
    public void sound(){
        System.out.println("Dog barks");
    }
}
