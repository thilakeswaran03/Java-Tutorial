public class inherit {
    // Base class
    static class Animal {
        void eat() {
            System.out.println("Animal is eating");
        }
    }

    // Derived class
    static class Dog extends Animal {
        void bark() {
            System.out.println("Dog is barking");
        }
    }

    // Derived class
    static class Cat extends Animal {
        void meow() {
            System.out.print("Cat is meowing");
        }
    }

    // Main class
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        dog.bark();
        animal.eat();
        Cat cat = new Cat();
        cat.meow();

    }
}