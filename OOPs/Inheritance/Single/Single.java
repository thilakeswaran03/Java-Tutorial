class Animal{
    Animal(){
        System.out.println("this is animal");
    }
    void sound(){
        System.out.println("Animal makes a sound");
    }
}
public class Single {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.sound();
    }
    
}
