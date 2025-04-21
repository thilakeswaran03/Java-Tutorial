interface Animal{
    public void name();
    public void sound(); // interface method (does not have a body)
}

interface guard{
    public void guard();
}


//child class implements both interfaces

class Child implements Animal, guard{
    @Override
    public void name(){
        System.out.println("Dog");
    }
    @Override
    public void sound(){
        System.out.println("Bark");
    }
    @Override
    public void guard(){
        System.out.println("Guarding the house");
    }

    
}
public class Main {
    public static void main(String[] args) {
        Child ch = new Child();
        ch.name();
        ch.sound();
        ch.guard();
    }
}
